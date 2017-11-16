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
import com.tencent.mm.R.n;
import com.tencent.mm.pluginsdk.model.app.an;
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.pluginsdk.model.app.i;
import com.tencent.mm.ui.base.MMGridView;
import com.tencent.mm.ui.base.preference.Preference;

public class AppPreference
  extends Preference
{
  private Context context;
  public AdapterView.OnItemClickListener qtA;
  public AdapterView.OnItemClickListener qtB;
  private View.OnClickListener qtC;
  private int qtD;
  private boolean qtE;
  private int qtF;
  int qtw;
  public a qtz;
  
  public AppPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    GMTrace.i(5808674832384L, 43278);
    GMTrace.o(5808674832384L, 43278);
  }
  
  public AppPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(5808809050112L, 43279);
    this.qtA = null;
    this.qtB = null;
    this.qtC = null;
    this.qtw = 0;
    this.qtE = false;
    this.qtF = 0;
    this.context = paramContext;
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, R.n.emB);
    this.qtD = paramContext.getInt(R.n.emC, 8);
    this.qtE = paramContext.getBoolean(R.n.emD, false);
    this.qtF = paramContext.getResourceId(R.n.emE, 0);
    paramContext.recycle();
    GMTrace.o(5808809050112L, 43279);
  }
  
  protected final void onBindView(View paramView)
  {
    GMTrace.i(5808943267840L, 43280);
    super.onBindView(paramView);
    MMGridView localMMGridView = (MMGridView)paramView.findViewById(R.h.bFD);
    this.qtz = new a(this.context, this.qtw);
    localMMGridView.setAdapter(this.qtz);
    localMMGridView.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(5803708776448L, 43241);
        if (AppPreference.this.qtz.oR(paramAnonymousInt))
        {
          AppPreference.this.qtz.ij(false);
          GMTrace.o(5803708776448L, 43241);
          return;
        }
        if (AppPreference.this.qtz.qtv)
        {
          if (AppPreference.this.qtB != null)
          {
            AppPreference.this.qtB.onItemClick(paramAnonymousAdapterView, paramAnonymousView, paramAnonymousInt, paramAnonymousLong);
            GMTrace.o(5803708776448L, 43241);
          }
        }
        else if (AppPreference.this.qtA != null) {
          AppPreference.this.qtA.onItemClick(paramAnonymousAdapterView, paramAnonymousView, paramAnonymousInt, paramAnonymousLong);
        }
        GMTrace.o(5803708776448L, 43241);
      }
    });
    if (this.qtE) {
      localMMGridView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener()
      {
        public final boolean onItemLongClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
        {
          GMTrace.i(5801561292800L, 43225);
          paramAnonymousAdapterView = AppPreference.this;
          if (paramAnonymousAdapterView.qtz != null)
          {
            paramAnonymousView = paramAnonymousAdapterView.qtz;
            if (paramAnonymousAdapterView.qtz.qtv) {
              break label54;
            }
          }
          label54:
          for (boolean bool = true;; bool = false)
          {
            paramAnonymousView.ij(bool);
            GMTrace.o(5801561292800L, 43225);
            return true;
          }
        }
      });
    }
    TextView localTextView = (TextView)paramView.findViewById(R.h.bwM);
    if (this.qtz.getCount() == 0)
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
      GMTrace.o(5808943267840L, 43280);
      return;
      localTextView.setVisibility(8);
      localMMGridView.setVisibility(0);
    }
  }
  
  public final void onPause()
  {
    GMTrace.i(5809345921024L, 43283);
    if (this.qtz != null) {
      an.aWy().j(this.qtz);
    }
    GMTrace.o(5809345921024L, 43283);
  }
  
  public final void onResume()
  {
    GMTrace.i(5809211703296L, 43282);
    if (this.qtz != null) {
      an.aWy().c(this.qtz);
    }
    GMTrace.o(5809211703296L, 43282);
  }
  
  public final f vQ(int paramInt)
  {
    GMTrace.i(5809077485568L, 43281);
    if ((paramInt < 0) || (paramInt >= this.qtz.getCount()))
    {
      GMTrace.o(5809077485568L, 43281);
      return null;
    }
    f localf = (f)this.qtz.getItem(paramInt);
    GMTrace.o(5809077485568L, 43281);
    return localf;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\subapp\ui\openapi\AppPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */