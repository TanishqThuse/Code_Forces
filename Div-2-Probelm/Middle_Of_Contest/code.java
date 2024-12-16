import java.util.*;
// using namespace std;

int main() {
    int h1, m1, h2, m2;
    char colon; // to read the ':' between hours and minutes

    // Input start time in the format hh:mm
    cin >> h1 >> colon >> m1;
    // Input end time in the format hh:mm
    cin >> h2 >> colon >> m2;

    // Convert both times to minutes from midnight
    int startTimeInMinutes = h1 * 60 + m1;
    int endTimeInMinutes = h2 * 60 + m2;

    // Calculate total duration of the contest in minutes
    int durationInMinutes = endTimeInMinutes - startTimeInMinutes;

    // Calculate the midpoint time in minutes from midnight
    int midTimeInMinutes = startTimeInMinutes + durationInMinutes / 2;

    // Convert the midpoint time back to hours and minutes
    int h3 = midTimeInMinutes / 60;
    int m3 = midTimeInMinutes % 60;

    // Output the midpoint time in the format hh:mm, with leading zeros
    cout << setw(2) << setfill('0') << h3 << ":"
         << setw(2) << setfill('0') << m3 << endl;

    return 0;
}
