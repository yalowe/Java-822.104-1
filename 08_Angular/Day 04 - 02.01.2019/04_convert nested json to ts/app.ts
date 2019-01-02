
interface Currency {
    code: string;
    name: string;
    symbol: string;
}

interface Language {
    iso639_1: string;
    iso639_2: string;
    name: string;
    nativeName: string;
}

interface Country {
    name: string;
    topLevelDomain: string[];
    alpha2Code: string;
    alpha3Code: string;
    callingCodes: string[];
    capital: string;
    altSpellings: string[];
    region: string;
    subregion: string;
    population: number;
    latlng: number[];
    demonym: string;
    area: number;
    gini: number;
    timezones: string[];
    borders: string[];
    nativeName: string;
    numericCode: string;
    currencies: Currency[];
    languages: Language[];
    flag: string;
    cioc: string;
}



let myCountry:Country={
    "name": "Israel",
    "topLevelDomain": [
        ".il"
    ],
    "alpha2Code": "IL",
    "alpha3Code": "ISR",
    "callingCodes": [
        "972"
    ],
    "capital": "Jerusalem",
    "altSpellings": [
        "IL",
        "State of Israel",
        "Medīnat Yisrā'el"
    ],
    "region": "Asia",
    "subregion": "Western Asia",
    "population": 8527400,
    "latlng": [
        31.5,
        34.75
    ],
    "demonym": "Israeli",
    "area": 20770.0,
    "gini": 39.2,
    "timezones": [
        "UTC+02:00"
    ],
    "borders": [
        "EGY",
        "JOR",
        "LBN",
        "SYR"
    ],
    "nativeName": "יִשְׂרָאֵל",
    "numericCode": "376",
    "currencies": [
        {
            "code": "ILS",
            "name": "Israeli new shekel",
            "symbol": "₪"
        }
    ],
    "languages": [
        {
            "iso639_1": "he",
            "iso639_2": "heb",
            "name": "Hebrew (modern)",
            "nativeName": "עברית"
        },
        {
            "iso639_1": "ar",
            "iso639_2": "ara",
            "name": "Arabic",
            "nativeName": "العربية"
        }
    ],
    "flag": "https://restcountries.eu/data/isr.svg",
    "cioc": "ISR"
};


