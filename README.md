# lobby-backend
Lobby – find the time when everyone’s free. Backend (Spring Boot, Java) of a web app that merges friends’ calendars and finds shared free time slots. Semester project, Web Technologies, HTW Berlin.

## Features

| Feature | Status |
| --- | --- |
| `TimeBlock` model + example data via `GET /timeblocks` | ✅ |
| Add / edit / delete time blocks (UC3–5) | 🚧 |
| Create a lobby (UC1) | 🔜 |
| Join a lobby via link (UC2) | 🔜 |
| Week view of all time blocks (UC6) | 🔜 |
| Show shared free slots (UC7) | 🔜 |
| Filter by time of day (UC8) | 🔜 |
| *Bonus:* iCal import (UC9) | 🔜 |
| *Bonus:* Login via Okta (UC10) | 🔜 |

✅ done · 🚧 in progress · 🔜 planned

## API

| Method | Path | Response |
| --- | --- | --- |
| `GET` | `/users` | `200` – list of example users |
| `GET` | `/timeblocks` | `200` – list of example time blocks (`id`, `personName`, `dayOfWeek`, `startTime`, `endTime`) |
