package com.mergington;

/**
 * Simple Java compatibility check class.
 * Tests that code compiles and runs on different Java versions (8 and 25).
 */
public class CompatibilityCheck {
    
    public static void main(String[] args) {
        System.out.println("Java Compatibility Check");
        System.out.println("========================");
        System.out.println("Java Version: " + System.getProperty("java.version"));
        System.out.println("Java Vendor: " + System.getProperty("java.vendor"));
        System.out.println("Java Runtime: " + System.getProperty("java.runtime.version"));
        
        // Test basic Java 8 features (lambda expressions, streams)
        java.util.List<String> activities = java.util.Arrays.asList(
            "Chess Club", 
            "Programming Class", 
            "Gym Class"
        );
        
        System.out.println("\nAvailable Activities:");
        activities.stream()
            .forEach(activity -> System.out.println("  - " + activity));
        
        System.out.println("\n✓ Compatibility check passed!");
    }
}
