package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.pluginsdk.model.app.g;
import com.tencent.mm.protocal.c.ds;

public final class a
  extends b<ds>
{
  public a(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(12690554617856L, 94552);
    GMTrace.o(12690554617856L, 94552);
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(12690688835584L, 94553);
    ds localds = (ds)getItem(paramInt);
    Bitmap localBitmap;
    if (paramView == null)
    {
      paramView = View.inflate(this.mContext, R.i.cpz, null);
      paramViewGroup = new a();
      paramViewGroup.lTp = ((ImageView)paramView.findViewById(R.h.bEd));
      paramViewGroup.lTr = ((TextView)paramView.findViewById(R.h.bcu));
      paramViewGroup.lTq = ((TextView)paramView.findViewById(R.h.bEK));
      paramView.setTag(paramViewGroup);
      localBitmap = zP(localds.lPg);
      if (localBitmap != null) {
        break label176;
      }
      paramViewGroup.lTp.setImageResource(R.g.aTM);
      label115:
      paramViewGroup.lTq.setText(g.m(this.mContext, localds.lPg));
      if (!g.Oq(localds.lPg)) {
        break label188;
      }
      paramViewGroup.lTr.setText(R.l.dAK);
    }
    for (;;)
    {
      GMTrace.o(12690688835584L, 94553);
      return paramView;
      paramViewGroup = (a)paramView.getTag();
      break;
      label176:
      paramViewGroup.lTp.setImageBitmap(localBitmap);
      break label115;
      label188:
      paramViewGroup.lTr.setText(R.l.dAL);
    }
  }
  
  static final class a
  {
    public ImageView lTp;
    public TextView lTq;
    public TextView lTr;
    
    a()
    {
      GMTrace.i(12747060281344L, 94973);
      GMTrace.o(12747060281344L, 94973);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\ui\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */