export class AppointmentDTO{
    constructor(appointment){
        this.name = appointment.name;
        this.time = appointment.time;
        this.kind = appointment.kind;
    }
}