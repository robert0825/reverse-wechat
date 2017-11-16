package com.tencent.mm.plugin.subapp.ui.openapi;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.tools.r;

public class AppHeaderPreference
  extends Preference
{
  boolean eWB;
  private ImageView hqg;
  private TextView hql;
  private TextView hvS;
  private TextView nNR;
  private boolean nNT;
  a qty;
  
  public AppHeaderPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(5795789930496L, 43182);
    this.eWB = false;
    this.nNT = false;
    GMTrace.o(5795789930496L, 43182);
  }
  
  public AppHeaderPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(5795924148224L, 43183);
    this.eWB = false;
    this.nNT = false;
    GMTrace.o(5795924148224L, 43183);
  }
  
  public final void onBindView(View paramView)
  {
    GMTrace.i(5796058365952L, 43184);
    this.hqg = ((ImageView)paramView.findViewById(R.h.bqt));
    this.hql = ((TextView)paramView.findViewById(R.h.brg));
    this.nNR = ((TextView)paramView.findViewById(R.h.bqQ));
    this.hvS = ((TextView)paramView.findViewById(R.h.bqD));
    this.nNT = true;
    if ((!this.nNT) || (this.qty == null)) {
      w.w("MicroMsg.HeaderPreference", "initView : bindView = " + this.nNT);
    }
    for (;;)
    {
      super.onBindView(paramView);
      GMTrace.o(5796058365952L, 43184);
      return;
      Object localObject = this.qty.brI();
      if ((this.hqg != null) && (localObject != null) && (!((Bitmap)localObject).isRecycled())) {
        this.hqg.setImageBitmap((Bitmap)localObject);
      }
      localObject = this.qty.brH();
      if ((this.nNR != null) && (localObject != null) && (((String)localObject).length() > 0)) {
        this.nNR.setText((CharSequence)localObject);
      }
      localObject = this.qty.getHint();
      if (localObject != null)
      {
        this.hvS.setText((CharSequence)localObject);
        this.hvS.setVisibility(0);
      }
      for (;;)
      {
        boolean bool = this.eWB;
        if (this.hql == null) {
          break;
        }
        localObject = this.qty.ik(bool);
        if (!bool) {
          break label323;
        }
        if ((localObject == null) || (((String)localObject).length() <= 0)) {
          break label311;
        }
        this.hql.setTextColor(r.fF(this.mContext));
        this.hql.setText((CharSequence)localObject);
        this.hql.setCompoundDrawablesWithIntrinsicBounds(R.g.baF, 0, 0, 0);
        break;
        this.hvS.setVisibility(8);
      }
      label311:
      this.hql.setVisibility(8);
      continue;
      label323:
      if ((localObject != null) && (((String)localObject).length() > 0))
      {
        this.hql.setTextColor(r.fG(this.mContext));
        this.hql.setText((CharSequence)localObject);
        this.hql.setCompoundDrawablesWithIntrinsicBounds(R.g.baE, 0, 0, 0);
      }
      else
      {
        this.hql.setVisibility(8);
      }
    }
  }
  
  public static abstract interface a
  {
    public abstract String brH();
    
    public abstract Bitmap brI();
    
    public abstract String getHint();
    
    public abstract String ik(boolean paramBoolean);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\subapp\ui\openapi\AppHeaderPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */