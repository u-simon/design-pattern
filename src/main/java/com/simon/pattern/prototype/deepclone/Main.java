package com.simon.pattern.prototype.deepclone;

/**
 * @author simon
 * @date 2020/11/7 17:42
 */
public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        DeepType deepType = new DeepType("tom", new DeepTypeTarget("tom", "cat"));

//        DeepType clone = (DeepType) deepType.clone();

//        System.out.println(deepType.getTarget().hashCode() + ", " + deepType.getName());
//        System.out.println(clone.getTarget().hashCode()+ ", " + clone.getName());

        DeepType clone = deepType.deepClone();
        System.out.println(deepType.getTarget().hashCode() + ", " + deepType.getName());
        System.out.println(clone.getTarget().hashCode()+ ", " + clone.getName());
    }
}
