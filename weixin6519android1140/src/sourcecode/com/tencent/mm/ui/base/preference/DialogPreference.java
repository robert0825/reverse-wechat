package com.tencent.mm.ui.base.preference;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ui.ListViewInScrollView;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.i;
import com.tencent.mm.ui.base.i.a;
import com.tencent.mm.v.a.h;
import com.tencent.mm.v.a.m;
import java.util.HashMap;

public final class DialogPreference
  extends Preference
{
  public i oaD;
  public Preference.a wjv;
  public final d wjx;
  public a wjy;
  
  public DialogPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    GMTrace.i(3204985126912L, 23879);
    GMTrace.o(3204985126912L, 23879);
  }
  
  public DialogPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(3205119344640L, 23880);
    this.wjx = new d(paramContext);
    paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, a.m.emI, paramInt, 0);
    paramInt = paramAttributeSet.getResourceId(a.m.ggG, -1);
    if (paramInt != -1) {
      this.wjx.wjt = paramContext.getResources().getStringArray(paramInt);
    }
    this.wjx.wju = paramAttributeSet.getTextArray(a.m.ggH);
    paramAttributeSet.recycle();
    this.wjx.caV();
    GMTrace.o(3205119344640L, 23880);
  }
  
  public final void a(Preference.a parama)
  {
    GMTrace.i(3205253562368L, 23881);
    this.wjv = parama;
    GMTrace.o(3205253562368L, 23881);
  }
  
  public final String getValue()
  {
    GMTrace.i(3205387780096L, 23882);
    String str = this.wjx.value;
    GMTrace.o(3205387780096L, 23882);
    return str;
  }
  
  public final void onBindView(View paramView)
  {
    GMTrace.i(3205656215552L, 23884);
    c localc = (c)this.wjx.values.get(this.wjx.value);
    if (localc != null) {
      setSummary(localc.text);
    }
    super.onBindView(paramView);
    GMTrace.o(3205656215552L, 23884);
  }
  
  public final void setValue(String paramString)
  {
    GMTrace.i(3205521997824L, 23883);
    this.wjx.value = paramString;
    paramString = (c)this.wjx.values.get(paramString);
    if (paramString == null)
    {
      this.wjx.nJs = -1;
      GMTrace.o(3205521997824L, 23883);
      return;
    }
    this.wjx.nJs = paramString.id;
    GMTrace.o(3205521997824L, 23883);
  }
  
  protected final void showDialog()
  {
    GMTrace.i(3205790433280L, 23885);
    ListViewInScrollView localListViewInScrollView = (ListViewInScrollView)View.inflate(this.mContext, a.h.gfk, null);
    localListViewInScrollView.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(3237734252544L, 24123);
        if (DialogPreference.this.oaD != null) {
          DialogPreference.this.oaD.dismiss();
        }
        DialogPreference.this.setValue((String)DialogPreference.this.wjx.wju[paramAnonymousInt]);
        if (DialogPreference.this.wjy != null) {
          DialogPreference.this.wjy.caW();
        }
        if (DialogPreference.this.wjv != null) {
          DialogPreference.this.wjv.a(DialogPreference.this, DialogPreference.this.getValue());
        }
        GMTrace.o(3237734252544L, 24123);
      }
    });
    localListViewInScrollView.setAdapter(this.wjx);
    i.a locala = new i.a(this.mContext);
    locala.Vz(getTitle().toString());
    locala.dg(localListViewInScrollView);
    this.oaD = locala.aax();
    this.oaD.show();
    h.a(this.mContext, this.oaD);
    GMTrace.o(3205790433280L, 23885);
  }
  
  public static abstract interface a
  {
    public abstract void caW();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\base\preference\DialogPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */