package org.example;

public class Person {
    private final String firstName;
    private final String lastName;
    private final int age;

    // Ek alanlar (final + getter ekledik)
    private final String email;
    private final String phoneNumber;
    private final String address;

    public Person(String firstName, String lastName, int age) {
        this(firstName, lastName, age, "Unknown", "Unknown", "Unknown");
    }

    public Person(String firstName, String lastName, int age,
                  String email, String phoneNumber, String address) {
        this.firstName = firstName;
        this.lastName  = lastName;
        this.age       = age;
        this.email     = email;
        this.phoneNumber = phoneNumber;
        this.address   = address;
    }

    public String getFirstName() { return firstName; }
    public String getLastName()  { return lastName; }
    public int getAge()          { return age; }
    public boolean isTeen()      { return age >= 13 && age <= 19; }

    // Ek alan getter'ları (kullanırsan "never accessed" uyarısı da biter)
    public String getEmail() { return email; }
    public String getPhoneNumber() { return phoneNumber; }
    public String getAddress() { return address; }
}