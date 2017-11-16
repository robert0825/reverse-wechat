package com.tencent.mm.plugin.location.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.m;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.MMGridPaper;
import com.tencent.mm.ui.base.k;
import java.util.ArrayList;
import java.util.Iterator;

public final class b
{
  private Context mContext;
  private MMGridPaper myA;
  private a myB;
  private ViewGroup myC;
  private RelativeLayout myD;
  private ArrayList<String> myE;
  private int myF;
  private k myz;
  
  private b(Context paramContext)
  {
    GMTrace.i(9712800104448L, 72366);
    this.myz = null;
    this.myA = null;
    this.myB = null;
    this.myC = null;
    this.myD = null;
    this.mContext = null;
    this.myE = null;
    this.myF = 0;
    this.mContext = paramContext;
    this.myz = new k(this.mContext, R.m.emn);
    this.myC = ((ViewGroup)((LayoutInflater)this.mContext.getSystemService("layout_inflater")).inflate(R.i.cpD, null));
    this.myA = ((MMGridPaper)this.myC.findViewById(R.h.bup));
    this.myA.bZQ();
    this.myA.bZO();
    this.myA.bZP();
    this.myA.bZN();
    this.myA.BZ(3);
    this.myA.bZR();
    this.myA.bZQ();
    this.myA.bZL();
    this.myA.bZM();
    this.myz.setCanceledOnTouchOutside(true);
    this.myz.setContentView(this.myC);
    this.myB = new a();
    this.myA.a(this.myB);
    GMTrace.o(9712800104448L, 72366);
  }
  
  public static void b(Context paramContext, ArrayList<String> paramArrayList)
  {
    GMTrace.i(9712934322176L, 72367);
    w.d("MicroMsg.AvatarsDialog", "showDialog, username.size = %d", new Object[] { Integer.valueOf(paramArrayList.size()) });
    paramContext = new b(paramContext);
    paramContext.myE = new ArrayList();
    paramArrayList = paramArrayList.iterator();
    String str;
    while (paramArrayList.hasNext())
    {
      str = (String)paramArrayList.next();
      paramContext.myE.add(str);
    }
    int i;
    if (paramContext.myE.size() < 3)
    {
      paramContext.myA.BZ(paramContext.myE.size());
      paramArrayList = paramContext.myA.getLayoutParams();
      paramContext.myF = com.tencent.mm.br.a.fromDPToPix(paramContext.mContext, 70);
      i = com.tencent.mm.br.a.fromDPToPix(paramContext.mContext, 8);
      if (paramContext.myE.size() <= 0) {
        break label449;
      }
      if (paramContext.myE.size() >= 3) {
        break label382;
      }
      int j = paramContext.myF;
      int k = paramContext.myE.size();
      i = i * (paramContext.myE.size() - 1) + j * k;
    }
    for (;;)
    {
      label195:
      str = BackwardSupportUtil.b.el(paramContext.mContext);
      w.d("MicroMsg.AvatarsDialog", "calculateGridWidth, result = %d, mUsername.size = %d, avatarSize = %d, densityType = %s", new Object[] { Integer.valueOf(i), Integer.valueOf(paramContext.myE.size()), Integer.valueOf(paramContext.myF), str });
      paramArrayList.width = i;
      paramContext.myF = com.tencent.mm.br.a.fromDPToPix(paramContext.mContext, 70);
      i = com.tencent.mm.br.a.fromDPToPix(paramContext.mContext, 15);
      if (paramContext.myE.size() > 0) {
        if (paramContext.myE.size() <= 3)
        {
          i += paramContext.myF;
          label306:
          w.d("MicroMsg.AvatarsDialog", "calculateGridHeight, result = %d", new Object[] { Integer.valueOf(i) });
        }
      }
      for (;;)
      {
        paramArrayList.height = i;
        paramContext.myA.setLayoutParams(paramArrayList);
        paramContext.myA.requestLayout();
        paramContext.myB.G(paramContext.myE);
        paramContext.myz.show();
        GMTrace.o(9712934322176L, 72367);
        return;
        paramContext.myA.BZ(3);
        break;
        label382:
        i = i * 2 + paramContext.myF * 3;
        break label195;
        if (paramContext.myE.size() <= 6)
        {
          i += paramContext.myF * 2;
          break label306;
        }
        i = i * 2 + paramContext.myF * 3 + com.tencent.mm.br.a.fromDPToPix(paramContext.mContext, 10);
        break label306;
        i = 0;
      }
      label449:
      i = 0;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\location\ui\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */