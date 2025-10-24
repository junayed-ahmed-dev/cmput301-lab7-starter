# CMPUT 301 : Lab 7 – Android UI Testing (Espresso)

### Student Details
**Full Name:** Junayed Ahmed  
**CCID:** junayed  

---

### References and Resources
- CMPUT 301 Lab 7 UI Testing Demo and TA Guide
- Espresso Testing Documentation (Android Developers)
- Android Developers Docs – ListView, Buttons, and Activity Navigation

---

### Verbal Collaboration
N/A (Didn't Collaborate)

---

### Objective
Create an Android app that allows users to add and clear cities in a ListView, and write **UI tests using Espresso** to validate user interactions and UI behavior.

---

### User Guide

1. **Launch the app** — see the main screen with action buttons and an empty city list.  
2. **Tap “ADD CITY”** — enter a city name in the text field and tap *CONFIRM*.  
3. **Tap “CLEAR ALL”** — removes all cities from the list.  
4. **Tap a city in the list** — navigates to a second screen (*ShowActivity*) that displays the selected city name.  
5. **Tap the BACK button** — returns to the main screen.

---

### Testing Checklist (Espresso)

| Test Name | Description |
|-----------|------------|
| `testAddCity()` | Add a city and verify it appears in the list |
| `testClearCity()` | Add multiple cities, clear them, verify the list is empty |
| `testListView()` | Ensure the city is displayed in the correct position |

All tests are executed using **ActivityScenarioRule** and **Espresso matchers** such as `onView()`, `withId()`, `withText()`, and `onData()`.

---

### Notes
- Tests run under the `androidTest` directory, **not** `test/`.
- The app uses **`Theme.AppCompat.Light`** to support a visible Action Bar and match lab UI expectations.
- Espresso ensures UI behavior works exactly as a user would experience on a real device.

---

### Compile SDK
**Compile SDK Version:** 34
