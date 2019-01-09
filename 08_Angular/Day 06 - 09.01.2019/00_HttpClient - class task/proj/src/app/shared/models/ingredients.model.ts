import { Malt } from "./malt.model";
import { Hop } from "./hop.model";

export interface Ingredients {
    malt: Malt[];
    hops: Hop[];
    yeast: string;
}