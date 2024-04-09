package com.java.how2injava.threads;

public class MultiThreadedClassLoader extends ClassLoader {
    
    public MultiThreadedClassLoader(ClassLoader parent) {
        super(parent);
    }

    @Override
    public Class<?> loadClass(String name) throws ClassNotFoundException {
        synchronized (getClassLoadingLock(name)) {
            // Check if the class has already been loaded
            Class<?> loadedClass = findLoadedClass(name);
            if (loadedClass != null) {
                return loadedClass;
            }

            // If the class has not been loaded, load it
            return findClass(name);
        }
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        // Implement your custom class loading logic here
        // This method should load the class bytes and define the class

        // For demonstration purposes, we will just load a built-in class
        try {
            return super.findClass(name);
        } catch (ClassNotFoundException e) {
            throw new ClassNotFoundException(name);
        }
    }

    public static void main(String[] args) {
        MultiThreadedClassLoader classLoader = new MultiThreadedClassLoader(ClassLoader.getSystemClassLoader());

        // Create multiple threads to load classes concurrently
        for (int i = 0; i < 5; i++) {
            final int threadNumber = i;
            new Thread(() -> {
                try {
                    Class<?> clazz = classLoader.loadClass("java.lang.String");
                    System.out.println("Thread " + threadNumber + " loaded class: " + clazz.getName());
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }
}
