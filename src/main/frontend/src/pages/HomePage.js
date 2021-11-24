import React, { Component } from "react";
import {  Grid, Typography } from "@material-ui/core";
import "../assets/css/HomePage.css"

class HomePage extends Component {
  render() {
    return this.renderHomePage();
  }

  renderHomePage = () => {
    const { renderListOfPhysicians, renderInformationPanel } = this;
    return (
      <Grid container spacing={5}>
        <Grid item xs={4} className="physician-panel">
          {renderListOfPhysicians()}
        </Grid>
        <Grid item xs={8}>
          {renderInformationPanel()}
        </Grid>
      </Grid>
    );
  };

  renderListOfPhysicians = () => {
    const { physicians } = this.props;
    return (
      <React.Fragment>
        <Typography variant="h4" className="notable-header">
          notable
        </Typography>
        <Typography variant="h5" className="physicians-header">
          <b>Physicians</b>
        </Typography>
        {physicians.map((physician) => {
          return this.renderPhysician(physician);
        })}
      </React.Fragment>
    );
  };

  renderPhysician = (physician) => {
    const { handlePhysicianClick } = this.props;
    return (
      <Typography
        variant="h6"
        className="physician-label"
        key={physician.email}
        onClick={() => handlePhysicianClick(physician)}
      >
        {physician.lastName}, {physician.firstName}
      </Typography>
    );
  };

  renderInformationPanel = () => {
    const { selectedPhysician } = this.props;
    if (selectedPhysician) {
      return this.renderListOfAppointments();
    } else {
      return <h2>Please Select A Physician To See Appointments</h2>;
    }
  };

  renderListOfAppointments = () => {
    const { appointments, selectedPhysician } = this.props;
    if (selectedPhysician) {
      return (
        <React.Fragment>
          <h1>
            {selectedPhysician.lastName + "," + selectedPhysician.firstName}
          </h1>
          <h2>{selectedPhysician.email}</h2>
          {appointments.map((appointment) => {
            return this.renderAppointment(appointment);
          })}
        </React.Fragment>
      );
    }
  };

  renderAppointment = (appointment) => {
    return (
      <Grid
        container
        key={appointment.name}
        spacing={2}
        style={{ backgroundColor: "lightblue" }}
      >
        <Grid item xs={4}>
          {appointment.name}
        </Grid>
        <Grid item xs={4}>
          {appointment.time}
        </Grid>
        <Grid item xs={4}>
          {appointment.kind}
        </Grid>
      </Grid>
    );
  };
}

export default HomePage;
