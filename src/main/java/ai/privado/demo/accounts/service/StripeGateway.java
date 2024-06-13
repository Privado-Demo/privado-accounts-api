package ai.privado.demo.accounts.service;

import ai.privado.demo.accounts.service.dto.UserProfileD;
import com.stripe.Stripe;
import com.stripe.model.Customer;
import com.stripe.param.CustomerCreateParams;

public class StripeService {
    public static void main(String[] args) {
        // Set your secret key. Remember to switch to your live secret key in production!
        // You can find your API keys in the Stripe Dashboard
        Stripe.apiKey = "your-secret-key";

        // Create a UserProfileD object
        UserProfileD userProfile = new UserProfileD();
        userProfile.setId("12345");
        userProfile.setFirstName("John");
        userProfile.setLastName("Doe");
        userProfile.setEmail("john.doe@example.com");
        userProfile.setPhone("+1234567890");
        userProfile.setPassword("securepassword");
        userProfile.setDob("1990-01-01");
        userProfile.setPanCardNumber("ABCDE1234F");
        userProfile.setAadhaarNumber("123412341234");
        userProfile.setSSN("123-45-6789");

        // Create a new customer in Stripe
        try {
            CustomerCreateParams params = CustomerCreateParams.builder(userProfile).build();
                //.setName(userProfile.getFirstName() + " " + userProfile.getLastName())
                //.setEmail(userProfile.getEmail())
                //.setPhone(userProfile.getPhone())
                //.build();

            Customer customer = Customer.create(params);

            System.out.println("Customer created successfully: " + customer.getId());
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Failed to create customer: " + e.getMessage());
        }
    }
}
