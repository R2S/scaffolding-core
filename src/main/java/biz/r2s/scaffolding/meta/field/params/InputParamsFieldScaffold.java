package biz.r2s.scaffolding.meta.field.params;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import biz.r2s.core.util.ObjectUtil;
import biz.r2s.scaffolding.meta.field.FieldScaffold;
import biz.r2s.scaffolding.meta.field.TypeFieldScaffold;

/**
 * Created by raphael on 24/07/15.
 */
public class InputParamsFieldScaffold implements ParamsFieldScaffold {
    String mask;
    List<String> classes;
    String helpBlock;
    String placeholder;
    boolean autofocus;
    String tabindex;
    String keypress;
    boolean required;
    FieldScaffold parent;
    private List<String> campos = new ArrayList<String>();
    
    public InputParamsFieldScaffold(){
        campos.addAll(Arrays.asList("mask", "classes", "helpBlock", "placeholder", "autofocus", "tabindex", "keypress", "required"));
    }  

    public void setCampos(String campoNovo) {
       campos.add(campoNovo);
    }

    public void removeCampus(String camporemove) {
        campos.remove(camporemove);
    }

    public boolean validate(Map<String, Object> params) {
        if (params!=null) {
            if (campos.containsAll(campos)) {
                return false;
            }
        }
        return true;
    }

    public TypeFieldScaffold getType() {
        return TypeFieldScaffold.INPUT;
    }

    public Map<String, Object> format() {
    	Map<String, Object>  meta = new HashMap<String, Object>();
        for(String campo: this.campos){
        	if(campo == "mask"){
                meta.put("sagui-mask", ObjectUtil.getValue(campo, this));
            }else{
            	meta.put(campo, ObjectUtil.getValue(campo, this));
            }
        }
        return meta;
    }

	public String getMask() {
		return mask;
	}

	public void setMask(String mask) {
		this.mask = mask;
	}

	public List<String> getClasses() {
		return classes;
	}

	public void setClasses(List<String> classes) {
		this.classes = classes;
	}

	public String getHelpBlock() {
		return helpBlock;
	}

	public void setHelpBlock(String helpBlock) {
		this.helpBlock = helpBlock;
	}

	public String getPlaceholder() {
		return placeholder;
	}

	public void setPlaceholder(String placeholder) {
		this.placeholder = placeholder;
	}

	public boolean isAutofocus() {
		return autofocus;
	}

	public void setAutofocus(boolean autofocus) {
		this.autofocus = autofocus;
	}

	public String getTabindex() {
		return tabindex;
	}

	public void setTabindex(String tabindex) {
		this.tabindex = tabindex;
	}

	public String getKeypress() {
		return keypress;
	}

	public void setKeypress(String keypress) {
		this.keypress = keypress;
	}

	public boolean isRequired() {
		return required;
	}

	public void setRequired(boolean required) {
		this.required = required;
	}

	public FieldScaffold getParent() {
		return parent;
	}

	public void setParent(FieldScaffold parent) {
		this.parent = parent;
	}

	public List<String> getCampos() {
		return campos;
	}

	public void setCampos(List<String> campos) {
		this.campos = campos;
	}
    
    
}
