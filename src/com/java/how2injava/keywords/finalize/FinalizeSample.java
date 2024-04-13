package com.java.how2injava.keywords.finalize;

public class FinalizeSample {
	public static void main(String[] args) {
        Resource resource = new Resource();
        
        // Nullify the reference to the object
        resource = null;
        
        // Request garbage collection
        System.gc();
    }
}
class Resource {
    public Resource() {
        System.out.println("Resource created.");
    }

    protected void finalize() {
        System.out.println("Resource being finalized.");
        // Cleanup operations
        // Close files, release resources, etc.
    }
}