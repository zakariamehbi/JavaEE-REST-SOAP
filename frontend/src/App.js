import React, { Component } from "react";
import "./App.css";
import axios from "axios";

class App extends Component {
	state = {
		ressources: null
	};

	componentDidMount() {
		axios.get(`http://localhost:8080/ressources`).then(res => {
			const ressources = res.data;
			this.setState({ ressources });
		});
	}

	render() {
		if (this.state.ressources != null) {
			console.log(this.state.ressources);

			return (
				<div className="App">
					<header className="App-header" />
					<ul>
						{this.state.ressources.map(ressource => (
							<li>{ressource.nom}</li>
						))}
					</ul>
				</div>
			);
		} else {
			return <div className="App">Waiting...</div>;
		}
	}
}

export default App;
