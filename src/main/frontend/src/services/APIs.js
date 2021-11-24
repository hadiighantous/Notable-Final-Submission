import axios from "axios";

class APIs {
  getPhysicians = () => {
    return axios.get("http://localhost:8080/api/physicians");
  };

  getAppointments = (physicianEmail) => {
    return axios.get(
      "http://localhost:8080/api/appointments/" + physicianEmail
    );
  };
}

export default new APIs();
