import { Fermentation } from "./fermentation.model";
import { MashTemp } from "./mash-temp.model";

export interface Method {
    mash_temp: MashTemp[];
    fermentation: Fermentation;
    twist?: any;
}