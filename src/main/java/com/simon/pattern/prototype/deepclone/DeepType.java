package com.simon.pattern.prototype.deepclone;

import java.io.*;

/**
 * @author simon
 * @date 2020/11/7 17:34
 */
public class DeepType implements Serializable, Cloneable {

    private static final long serialVersionUID = -66458788130383436L;
    private String name;

    private DeepTypeTarget target;

    public DeepType(String name, DeepTypeTarget target) {
        this.name = name;
        this.target = target;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DeepTypeTarget getTarget() {
        return target;
    }

    public void setTarget(DeepTypeTarget target) {
        this.target = target;
    }

    /**
     * 深克隆 方式1：使用clone方法
     *
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        DeepType deepType = null;
        deepType = (DeepType) super.clone();
        DeepTypeTarget target = (DeepTypeTarget) this.target.clone();
        this.target = target;
        return deepType;
    }


    /**
     * 深克隆 方式2： 使用反序列化
     *
     * @return
     */
    public DeepType deepClone() {
        DeepType deepType = null;
        try (ByteArrayOutputStream bos = new ByteArrayOutputStream();
             ObjectOutputStream oos = new ObjectOutputStream(bos)) {
            oos.writeObject(this);
            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            deepType = (DeepType) ois.readObject();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return deepType;
    }
}
