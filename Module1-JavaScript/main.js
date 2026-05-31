// JavaScript Basics

console.log("Welcome to the Community Portal");

window.onload = function () {
    alert("Page Loaded Successfully");
};

// Variables

const eventName = "Music Festival";
const eventDate = "10 June";
let seats = 5;

console.log(`${eventName} on ${eventDate} | Seats: ${seats}`);

// Constructor Function

function Event(name, category, seats) {

    this.name = name;
    this.category = category;
    this.seats = seats;
}

// Prototype Method

Event.prototype.checkAvailability = function () {

    return this.seats > 0;
};

// Functions

function addEvent(event) {

    events.push(event);
}

// Default Parameter Function

function greetUser(name = "Guest") {

    console.log("Welcome " + name);
}

greetUser();

// Events Array

let events = [

    new Event("Music Festival", "Music", 5),

    new Event("Guitar Night", "Music", 2),

    new Event("Dance Show", "Music", 4),

    new Event("Baking Workshop", "Workshop", 3),

    new Event("Photography Workshop", "Workshop", 6),

    new Event("Coding Workshop", "Workshop", 8),

    new Event("Art Exhibition", "Workshop", 5)

];

// Object Entries

console.log(Object.entries(events[0]));

// Destructuring

const { name, category } = events[0];

console.log(name, category);

// Spread Operator

const copiedEvents = [...events];

console.log(copiedEvents);

// Map Method

const eventTitles = events.map(

    event => `Workshop on ${event.name}`

);

console.log(eventTitles);

// Closure

function registrationCounter() {

    let total = 0;

    return function () {

        total++;

        console.log(
            "Total Registrations:",
            total
        );
    };
}

const countRegistration =
registrationCounter();

// DOM Access

const container =
document.querySelector("#eventContainer");

// Display Events

function displayEvents(
    eventList = events
) {

    container.innerHTML = "";

    eventList.forEach(event => {

        if (event.checkAvailability()) {

            const card =
                document.createElement("div");

            card.className = "card";

            card.innerHTML = `
                <h3>${event.name}</h3>

                <p>
                    Category:
                    ${event.category}
                </p>

                <p>
                    Seats Available:
                    ${event.seats}
                </p>

                <button onclick=
                "registerUser(events[
                ${events.indexOf(event)}
                ])">

                Register

                </button>
            `;

            container.appendChild(card);
        }
    });
}

displayEvents();

// Register User

function registerUser(eventObj) {

    try {

        if (eventObj.seats <= 0) {

            throw "No Seats Available";
        }

        eventObj.seats--;

        countRegistration();

        displayEvents();
    }

    catch (error) {

        alert(error);
    }
}

// Higher Order Function

function filterEventsByCategory(
    category,
    callback
) {

    let filtered;

    if (category === "All") {

        filtered = events;
    }

    else {

        filtered =
            events.filter(
                event =>
                    event.category === category
            );
    }

    callback(filtered);
}

// Category Filter

document
    .querySelector("#categoryFilter")
    .onchange = function () {

        filterEventsByCategory(
            this.value,
            displayEvents
        );
    };

// Search Event

document
    .querySelector("#searchBox")
    .addEventListener(
        "keyup",

        function () {

            let text =
                this.value.toLowerCase();

            let result =
                events.filter(
                    event =>
                        event.name
                            .toLowerCase()
                            .includes(text)
                );

            displayEvents(result);
        });

// Form Submission

document
    .querySelector("#registerForm")
    .addEventListener(
        "submit",

        async function (event) {

            event.preventDefault();

            console.log(
                "Form Submitted"
            );

            const form =
                event.target;

            const userName =
                form.elements["name"].value;

            const email =
                form.elements["email"].value;

            const selectedEvent =
                form.elements["event"].value;

            console.log(userName);
            console.log(email);
            console.log(selectedEvent);

            if (
                userName === "" ||
                email === ""
            ) {

                document
                    .querySelector("#message")
                    .innerHTML =
                    "<span class='error'>Please fill all fields</span>";

                return;
            }

            document
                .querySelector("#spinner")
                .style.display =
                "block";

            try {

                const response =
                    await fetch(
                        "https://jsonplaceholder.typicode.com/posts",
                        {
                            method: "POST",

                            body: JSON.stringify({

                                userName,
                                email,
                                selectedEvent
                            }),

                            headers: {
                                "Content-Type":
                                    "application/json"
                            }
                        });

                await response.json();

                setTimeout(() => {

                    document
                        .querySelector("#spinner")
                        .style.display =
                        "none";

                    document
                        .querySelector("#message")
                        .innerHTML =
                        "<span class='success'>Registration Successful</span>";

                }, 1000);

            }

            catch (error) {

                document
                    .querySelector("#message")
                    .innerHTML =
                    "<span class='error'>Registration Failed</span>";
            }
        });

// Fetch Using Then & Catch

fetch(
    "https://jsonplaceholder.typicode.com/posts/1"
)

    .then(response =>
        response.json())

    .then(data =>
        console.log(data))

    .catch(error =>
        console.log(error));

// jQuery

$("#registerBtn").click(function () {

    $(".card").fadeOut(500);

    $(".card").fadeIn(500);
});

// React / Vue Benefit

// React and Vue help build large applications
// using reusable components and better UI management.