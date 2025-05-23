/* 5c. Develop a Swing program in Java to add the countries USA, India, Vietnam, Canada,
   Denmark, France, Great Britain, Japan, Africa, Greenland, Singapore into a JList and
   display the capital of the countries on console whenever the countries are selected on the list.
*/


import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.util.*;

public class CountryCapitalViewer extends JFrame {

    private JList<String> countryList;
    private Map<String, String> countryCapitalMap;

    public CountryCapitalViewer() {
        setTitle("Country List with Capitals");
        setSize(300, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Initialize country-capital map
        countryCapitalMap = new HashMap<>();
        countryCapitalMap.put("USA", "Washington, D.C.");
        countryCapitalMap.put("India", "New Delhi");
        countryCapitalMap.put("Vietnam", "Hanoi");
        countryCapitalMap.put("Canada", "Ottawa");
        countryCapitalMap.put("Denmark", "Copenhagen");
        countryCapitalMap.put("France", "Paris");
        countryCapitalMap.put("Great Britain", "London");
        countryCapitalMap.put("Japan", "Tokyo");
        countryCapitalMap.put("Africa", "No single capital"); // Africa is a continent
        countryCapitalMap.put("Greenland", "Nuuk");
        countryCapitalMap.put("Singapore", "Singapore");

        // Country list
        String[] countries = countryCapitalMap.keySet().toArray(new String[0]);
        Arrays.sort(countries);

        countryList = new JList<>(countries);
        countryList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        JScrollPane scrollPane = new JScrollPane(countryList);
        add(scrollPane, BorderLayout.CENTER);

        // Add ListSelectionListener
        countryList.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    java.util.List<String> selectedCountries = countryList.getSelectedValuesList();
                    System.out.println("Selected Countries and Capitals:");
                    for (String country : selectedCountries) {
                        String capital = countryCapitalMap.getOrDefault(country, "Unknown");
                        System.out.println(country + " → " + capital);
                    }
                    System.out.println();
                }
            }
        });

        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new CountryCapitalViewer();
    }
}
