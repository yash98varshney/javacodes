package OOD.PropertyHunt.Services;

import OOD.PropertyHunt.Entities.Enums.ListingType;
import OOD.PropertyHunt.Entities.Enums.RoomType;

public interface PropertyHuntService {
    
    void listProperty(String propertyId, String propertyTitle, String location, String price, ListingType listingType,
    String size,
    RoomType roomType);

    void viewListedProperty();

    void shortListProperty(String propertyID);

    void viewShortListProperty();

    void markAsSold(String propertyId, String soldTo, String soldPrice);

    void searchProperty(String location, String price, ListingType listingType, String size, RoomType roomType);

    String loginUser(String name);

}
