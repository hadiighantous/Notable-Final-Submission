import React, { Component } from "react";
import HomePage from "./pages/HomePage";
import PhysicianDTO from "./services/dto/PhysicianDTO";
import APIs from "./services/APIs";
import { AppointmentDTO } from "./services/dto/AppointmentDTO";


class App extends Component {
  constructor(props) {
    super(props);
    this.state = { physicians: [], appointments: [] };
  }

  render() {
    return this.renderHomePage();
  }

  renderHomePage = () => {
    const { physicians, selectedPhysician, appointments } = this.state;
    const { handlePhysicianClick } = this;
    return (
      <HomePage
        physicians={physicians}
        selectedPhysician={selectedPhysician}
        appointments={appointments}
        handlePhysicianClick={handlePhysicianClick}
      />
    );
  };

  componentDidMount() {
    APIs.getPhysicians().then((response) => {
      let physicians = [];
      response.data.forEach((physician) =>
        physicians.push(new PhysicianDTO(physician))
      );
      this.setState({ physicians });
    });
  }

  handlePhysicianClick = (physician) => {
    APIs.getAppointments(physician.email).then((response) => {
      let appointments = [];
      response.data.forEach((appointment) =>
        appointments.push(new AppointmentDTO(appointment))
      );
      this.setState({
        selectedPhysician: physician,
        appointments: appointments,
      });
    });
  };
}

export default App;
