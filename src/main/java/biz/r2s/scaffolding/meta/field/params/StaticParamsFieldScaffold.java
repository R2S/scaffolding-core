package biz.r2s.scaffolding.meta.field.params;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import biz.r2s.scaffolding.meta.field.FieldScaffold;
import biz.r2s.scaffolding.meta.field.TypeFieldScaffold;

/**
 * Created by raphael on 24/07/15.
 */
public class StaticParamsFieldScaffold implements ParamsFieldScaffold {

    public FieldScaffold getParent() {
		return parent;
	}

	public void setParent(FieldScaffold parent) {
		this.parent = parent;
	}

	FieldScaffold parent;

    public boolean validate(Map<String,Object> params) {
    	return true;
    }

    public TypeFieldScaffold getType() {
        return TypeFieldScaffold.STATIC;
    }
    
    public Map<String, Object> format() {
    	return new java.util.HashMap();
    }
}
