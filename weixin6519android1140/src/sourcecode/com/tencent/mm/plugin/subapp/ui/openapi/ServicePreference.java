package com.tencent.mm.plugin.subapp.ui.openapi;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.n;
import com.tencent.mm.pluginsdk.model.app.an;
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.pluginsdk.model.app.i;
import com.tencent.mm.ui.base.MMGridView;
import com.tencent.mm.ui.base.preference.Preference;
import java.util.List;

public class ServicePreference
  extends Preference
{
  private Context context;
  public AdapterView.OnItemClickListener qtA;
  public AdapterView.OnItemClickListener qtB;
  private View.OnClickListener qtC;
  private int qtD;
  private boolean qtE;
  private int qtF;
  public b qtU;
  List<f> qtx;
  
  public ServicePreference(Context paramContext)
  {
    this(paramContext, null);
    GMTrace.i(5802232381440L, 43230);
    GMTrace.o(5802232381440L, 43230);
  }
  
  public ServicePreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    GMTrace.i(5802366599168L, 43231);
    GMTrace.o(5802366599168L, 43231);
  }
  
  public ServicePreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(5802500816896L, 43232);
    this.qtA = null;
    this.qtB = null;
    this.qtC = null;
    this.qtE = false;
    this.qtF = 0;
    this.context = paramContext;
    setLayoutResource(R.i.cpn);
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, R.n.emB);
    this.qtD = paramContext.getInt(R.n.emC, 8);
    this.qtE = paramContext.getBoolean(R.n.emD, false);
    this.qtF = paramContext.getResourceId(R.n.emE, 0);
    paramContext.recycle();
    GMTrace.o(5802500816896L, 43232);
  }
  
  protected final void onBindView(View paramView)
  {
    GMTrace.i(5802635034624L, 43233);
    super.onBindView(paramView);
    MMGridView localMMGridView = (MMGridView)paramView.findViewById(R.h.bFD);
    if (localMMGridView == null)
    {
      GMTrace.o(5802635034624L, 43233);
      return;
    }
    this.qtU = new b(this.context, this.qtx);
    an.aWy().j(this.qtU);
    an.aWy().c(this.qtU);
    localMMGridView.setAdapter(this.qtU);
    localMMGridView.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(5803977211904L, 43243);
        if (ServicePreference.this.qtU.oR(paramAnonymousInt))
        {
          ServicePreference.this.qtU.ij(false);
          GMTrace.o(5803977211904L, 43243);
          return;
        }
        if (ServicePreference.this.qtU.qtv)
        {
          if (ServicePreference.this.qtB != null)
          {
            ServicePreference.this.qtB.onItemClick(paramAnonymousAdapterView, paramAnonymousView, paramAnonymousInt, paramAnonymousLong);
            GMTrace.o(5803977211904L, 43243);
          }
        }
        else if (ServicePreference.this.qtA != null) {
          ServicePreference.this.qtA.onItemClick(paramAnonymousAdapterView, paramAnonymousView, paramAnonymousInt, paramAnonymousLong);
        }
        GMTrace.o(5803977211904L, 43243);
      }
    });
    if (this.qtE) {
      localMMGridView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener()
      {
        public final boolean onItemLongClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
        {
          GMTrace.i(5799682244608L, 43211);
          paramAnonymousAdapterView = ServicePreference.this;
          if (paramAnonymousAdapterView.qtU != null)
          {
            paramAnonymousView = paramAnonymousAdapterView.qtU;
            if (paramAnonymousAdapterView.qtU.qtv) {
              break label54;
            }
          }
          label54:
          for (boolean bool = true;; bool = false)
          {
            paramAnonymousView.ij(bool);
            GMTrace.o(5799682244608L, 43211);
            return true;
          }
        }
      });
    }
    TextView localTextView = (TextView)paramView.findViewById(R.h.bwM);
    if (this.qtU.getCount() == 0)
    {
      localTextView.setVisibility(0);
      localTextView.setText(this.qtF);
      localMMGridView.setVisibility(8);
    }
    for (;;)
    {
      paramView = (Button)paramView.findViewById(R.h.biw);
      paramView.setVisibility(this.qtD);
      paramView.setOnClickListener(this.qtC);
      GMTrace.o(5802635034624L, 43233);
      return;
      localTextView.setVisibility(8);
      localMMGridView.setVisibility(0);
    }
  }
  
  public final void onPause()
  {
    GMTrace.i(5803037687808L, 43236);
    if (this.qtU != null) {
      an.aWy().j(this.qtU);
    }
    GMTrace.o(5803037687808L, 43236);
  }
  
  public final void onResume()
  {
    GMTrace.i(5802903470080L, 43235);
    if (this.qtU != null) {
      an.aWy().c(this.qtU);
    }
    GMTrace.o(5802903470080L, 43235);
  }
  
  public final f vQ(int paramInt)
  {
    GMTrace.i(5802769252352L, 43234);
    if ((paramInt < 0) || (paramInt >= this.qtU.getCount()))
    {
      GMTrace.o(5802769252352L, 43234);
      return null;
    }
    f localf = (f)this.qtU.getItem(paramInt);
    GMTrace.o(5802769252352L, 43234);
    return localf;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\subapp\ui\openapi\ServicePreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */