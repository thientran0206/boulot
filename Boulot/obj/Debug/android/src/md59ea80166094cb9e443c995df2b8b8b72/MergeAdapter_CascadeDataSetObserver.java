package md59ea80166094cb9e443c995df2b8b8b72;


public class MergeAdapter_CascadeDataSetObserver
	extends android.database.DataSetObserver
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onChanged:()V:GetOnChangedHandler\n" +
			"n_onInvalidated:()V:GetOnInvalidatedHandler\n" +
			"";
		mono.android.Runtime.register ("Boulot.MergeAdapter+CascadeDataSetObserver, Boulot, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", MergeAdapter_CascadeDataSetObserver.class, __md_methods);
	}


	public MergeAdapter_CascadeDataSetObserver ()
	{
		super ();
		if (getClass () == MergeAdapter_CascadeDataSetObserver.class)
			mono.android.TypeManager.Activate ("Boulot.MergeAdapter+CascadeDataSetObserver, Boulot, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onChanged ()
	{
		n_onChanged ();
	}

	private native void n_onChanged ();


	public void onInvalidated ()
	{
		n_onInvalidated ();
	}

	private native void n_onInvalidated ();

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
