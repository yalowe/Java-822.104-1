import { Volume } from "./volume.model";

export interface Hop {
    name: string;
    amount: Volume;
    add: string;
    attribute: string;
}