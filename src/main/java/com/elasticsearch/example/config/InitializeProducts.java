package com.elasticsearch.example.config;

import com.elasticsearch.example.model.Product;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.stereotype.Component;

@Component
public class InitializeProducts implements CommandLineRunner {
    private final ElasticsearchOperations operations;

    public InitializeProducts(ElasticsearchOperations operations) {
        this.operations = operations;
    }

    @Override
    public void run(String... args) {
        operations.save(Product.builder()
            .id("1")
            .name("Iphone 12 Pro Max")
            .description("The iPhone 12 Pro Max is the most powerful iPhone ever, with a 6.7-inch Super Retina XDR display, A14 Bionic chip, and Ceramic Shield with four times better drop performance. It has a triple-camera system with a 12MP Ultra Wide, Wide, and Telephoto camera, Night mode, and 4K video up to 60fps. It also features LiDAR Scanner for Night mode portraits and next-level AR experiences, and 5G for superfast download speeds. All in a beautiful new design with IP68 water resistance.")
            .category("Electronics")
            .brand("Apple")
            .price(1399.99)
            .quantity(10)
            .build()
        );

        operations.save(Product.builder()
            .id("2")
            .name("Samsung Galaxy S21 Ultra")
            .description("The Samsung Galaxy S21 Ultra is the most powerful Galaxy smartphone ever, with a 6.8-inch Dynamic AMOLED 2X display, Snapdragon 888 or Exynos 2100 processor, and 5,000mAh battery with 25W fast charging. It has a quad-camera system with a 108MP Wide, 10MP Telephoto, 10MP 3x Optical Zoom, and 12MP Ultra Wide camera, 8K video recording, and 30x Space Zoom. It also features a 40MP front-facing camera, 5G for superfast download speeds, and IP68 water resistance. All in a beautiful new design with a 3D Curved Glass back.")
            .category("Electronics")
            .brand("Samsung")
            .price(1199.99)
            .quantity(10)
            .build()
        );

        operations.save(Product.builder()
            .id("3")
            .name("MacBook Pro 13-inch")
            .description("The MacBook Pro 13-inch is the most powerful 13-inch notebook ever, with a 13.3-inch Retina display, 10th-generation Intel Core processors, and up to 2TB of storage. It has a Force Touch trackpad, Touch Bar, and Touch ID. It also features Thunderbolt 3 (USB-C) ports for charging and connecting devices, and all-day battery life. All in a thin and light iconic design made from 100 percent recycled aluminum.")
            .category("Electronics")
            .brand("Apple")
            .price(1299.99)
            .quantity(10)
            .build()
        );

        operations.save(Product.builder()
            .id("4")
            .name("MacBook Air 13-inch")
            .description("The MacBook Air 13-inch is the most powerful 13-inch notebook ever, with a 13.3-inch Retina display, 10th-generation Intel Core processors, and up to 2TB of storage. It has a Force Touch trackpad, Touch Bar, and Touch ID. It also features Thunderbolt 3 (USB-C) ports for charging and connecting devices, and all-day battery life. All in a thin and light iconic design made from 100 percent recycled aluminum.")
            .category("Electronics")
            .brand("Apple")
            .price(999.99)
            .quantity(10)
            .build()
        );

        operations.save(Product.builder()
            .id("5")
            .name("MacBook Pro 16-inch")
            .description("The MacBook Pro 16-inch is the most powerful 16-inch notebook ever, with a 16-inch Retina display, 9th-generation Intel Core processors, and up to 8TB of storage. It has a Force Touch trackpad, Touch Bar, and Touch ID. It also features Thunderbolt 3 (USB-C) ports for charging and connecting devices, and all-day battery life. All in a thin and light iconic design made from 100 percent recycled aluminum.")
            .category("Electronics")
            .brand("Apple")
            .price(2399.99)
            .quantity(10)
            .build()
        );
    }
}
