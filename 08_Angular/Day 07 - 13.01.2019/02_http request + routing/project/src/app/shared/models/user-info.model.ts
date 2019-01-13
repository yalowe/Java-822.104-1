export interface UserInfo {
    
    //this we always use (also in PUT / POST request)
    name: string;
    job: string;

    //this we use only in POST response
    id?: string;
    createdAt?: Date;
    
    //this we use only in PUT response
    updatedAt?: Date;
   
}