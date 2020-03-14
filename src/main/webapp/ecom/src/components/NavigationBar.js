import React from 'react';
import {Navbar, Nav} from 'react-bootstrap';
import {Link} from 'react-router-dom';




class NavigationBar extends React.Component{

   render() {
        return (
        <div>
           <Navbar bg="dark" variant="dark">
               <Navbar.Brand href="#home">Limam Shop</Navbar.Brand>
               <Nav className="mr-auto">
                     <Nav.Link href="#">Home</Nav.Link>
                     <Nav.Link href="#">Ajouter un Commande</Nav.Link>
                     <Nav.Link href="#">Liste Commande  </Nav.Link>
                   </Nav>

             </Navbar>
             </div>
        );
    }
    }
      export default  NavigationBar;






