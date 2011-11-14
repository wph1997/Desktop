package org.docear.plugin.bibtex.listeners;

import org.docear.plugin.bibtex.ReferencesController;
import org.freeplane.features.attribute.AttributeController;
import org.freeplane.features.attribute.NodeAttributeTableModel;
import org.freeplane.features.map.INodeSelectionListener;
import org.freeplane.features.map.NodeModel;
import org.freeplane.features.mode.Controller;

public class NodeSelectionListener implements INodeSelectionListener {

	
	public void init() {
		Controller.getCurrentModeController().getMapController().addNodeSelectionListener(this);		
	}
	
	
	public void onDeselect(NodeModel node) {		
	}


	public void onSelect(NodeModel node) {
		NodeAttributeTableModel attributes = AttributeController.getController().createAttributeTableModel(Controller.getCurrentModeController().getMapController().getSelectedNode());
		attributes.addTableModelListener(ReferencesController.getController().getAttributeListener());
	}

}
