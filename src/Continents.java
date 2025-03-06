public class Continents {
    // Este programa muestra la ciudad mas grande del continente elegido
    String continentName;
    String largestCity;
    public Continents(int continent) {
    switch (continent) {
        case 1:
            continentName = "North America";
            largestCity = "Mexico City, Mexico";
            break;
        case 2:
            continentName = "Sourth America";
            largestCity = "Sao Paulo, Brazil";
            break;
        case 3:
            continentName = "Europe";
            largestCity = "Moscow, Russia";
            break;
        case 4:
            continentName = "Africa";
            largestCity = "Lagos, Nigeria";
            break;
        case 5:
            continentName = "Asia";
            largestCity = "Shanghai, China";
            break;
        case 6:
            continentName = "Australia";
            largestCity = "Sydney, Australia";
            break;
        case 7:
            continentName = "Antarctica";
            largestCity = "McMurdo Station, US";
            break;
        default:
            continentName = "Undefined continent";
            largestCity = "Undefined city";
        }
    }
    public String toString(){
        return "Continent Name: " + "\nLargest City: " + largestCity;
    }
}
