import React from 'react';
import {container,Row,Jumbotron,Col} from 'react-bootstrap';



class Welcome extends React.Component{

   render() {
   const marginTop={
      marginTop:"20px"
   }

        return (
        <div>
           <container>
                  <Row>
                  <Col lg={12} style={marginTop}>
                   <Jumbotron className="bg-dark text-white">
                     <h1>Bonjour À Tous!!</h1>
                     <p>
                       Achat et vente sur Limam Shop: premier distributeur en Afrique. Acheter et vendre en ligne est devenu plus
                       facile avec Limam Shop, car il vous offre la meilleure expérience d'achat.
                     </p>

                   </Jumbotron>
                   </Col>

                  </Row>

              </container>

        </div>
        );
    }
    }
      export default  Welcome;
