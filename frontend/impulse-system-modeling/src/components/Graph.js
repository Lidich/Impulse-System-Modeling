import React, { useState } from "react";
import Graph from 'react-vis-network-graph'

export default function GraphView(){
    
    const graph = {
        nodes: [
            {id: 1, label: "Node 1", color: "red", value: 1},
            {id: 2, label: "Node 2"},
            {id: 3, label: "Node 3"},
            {id: 4, label: "Node 4"},
            {id: 5, label: "Node 5"},
            {id: 6, label: "Node 6"},
            {id: 7, label: "Node 7"},
            {id: 8, label: "Node 8"},
            {id: 9, label: "Node 9"},
        ],
        edges: [
            {from: 1, to: 1, color: "red", weight: 1, label: "1"},
            {from: 1, to: 7, color: "red"},
            {from: 1, to: 2},
        ]
    }
    const options = {
        insteraction: {
            navigationButtons: true
        },
        edges: {
            color: "yellow",
        },
        height: "900px",
        manipulation: {
            enabled: true,
            initiallyActive: false,
            addNode: true,
            addEdge: true,
            editNode: undefined,
            editEdge: true,
            deleteNode: true,
            deleteEdge: true,
            controlNodeStyle:{
              // all node options are valid.
            }
          }
    }

    const graphTest = {
        nodes: [
            {id: 1, label: "Node 1", color: "red"},
            {id: 2, label: "Node 2"},

        ],
        edges: [
            {from: 1, to: 1, color: "red"},
        ]
    }

//    const [graph, setGraph] = useState(graphStart)
//    const [options, setOptions] = useState(optionsStart)
    
    return(
        <div>
            <Graph click={() => console.log("test")}
                graph={graph}    
                options={options}    
            />
        </div>
    )
}