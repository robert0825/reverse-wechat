package com.tencent.mm.plugin.wallet_core.ui.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.NinePatch;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.platformtools.j.a;
import com.tencent.mm.plugin.wallet_core.e.a;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.e;
import com.tencent.mm.plugin.wallet_core.model.n;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.q;

public final class b
{
  public static View a(Context paramContext, View paramView, Bankcard paramBankcard, int paramInt, a parama, boolean paramBoolean)
  {
    GMTrace.i(16594008801280L, 123635);
    a locala;
    if ((paramView == null) || (paramView.getTag() == null))
    {
      paramView = View.inflate(paramContext, paramInt, null);
      locala = new a();
      locala.qWm = ((ImageView)paramView.findViewById(a.f.sqk));
      locala.qWi = ((TextView)paramView.findViewById(a.f.sql));
      locala.qWj = ((TextView)paramView.findViewById(a.f.sqI));
      locala.qWh = ((TextView)paramView.findViewById(a.f.squ));
      locala.qWn = ((TextView)paramView.findViewById(a.f.sqt));
      locala.rqj = ((ViewGroup)paramView.findViewById(a.f.sIK));
      locala.qWl = ((ImageView)paramView.findViewById(a.f.sqC));
      locala.qWo = ((TextView)paramView.findViewById(a.f.sqp));
      locala.rql = ((ViewGroup)paramView.findViewById(a.f.sqr));
      locala.rqm = ((TextView)paramView.findViewById(a.f.sqo));
      locala.rqn = ((ImageView)paramView.findViewById(a.f.sqD));
      paramView.setTag(locala);
      if (paramBankcard.field_bankcardState != 1) {
        break label403;
      }
      locala.qWn.setVisibility(0);
      label223:
      if (locala.rqn != null)
      {
        if (!paramBoolean) {
          break label416;
        }
        locala.rqn.setVisibility(0);
      }
      label245:
      locala.qWi.setText(paramBankcard.field_bankName);
      if (!q.zR()) {
        break label429;
      }
      locala.qWj.setVisibility(8);
      label273:
      if (locala.qWh != null) {
        locala.qWh.setText(paramBankcard.field_bankcardTail);
      }
      if ((bg.nm(paramBankcard.field_card_bottom_wording)) || (locala.rqm == null)) {
        break label510;
      }
      locala.rqm.setText(paramBankcard.field_card_bottom_wording);
      locala.rql.setVisibility(0);
    }
    for (;;)
    {
      parama.a(paramContext, paramBankcard, locala.qWm, locala.rqj, locala.qWl);
      if (locala.qWo != null)
      {
        n.byx();
        paramContext = paramBankcard.field_bindSerial;
        locala.qWo.setVisibility(8);
      }
      GMTrace.o(16594008801280L, 123635);
      return paramView;
      locala = (a)paramView.getTag();
      break;
      label403:
      locala.qWn.setVisibility(8);
      break label223;
      label416:
      locala.rqn.setVisibility(8);
      break label245;
      label429:
      if (!bg.nm(paramBankcard.field_bankcardTypeName))
      {
        locala.qWj.setText(paramBankcard.field_bankcardTypeName);
        break label273;
      }
      if (paramBankcard.byc())
      {
        locala.qWj.setText(a.i.thE);
        break label273;
      }
      if (paramBankcard.byf())
      {
        locala.qWj.setText(a.i.tbg);
        break label273;
      }
      locala.qWj.setText(a.i.tbv);
      break label273;
      label510:
      locala.rql.setVisibility(8);
    }
  }
  
  public static Drawable c(Context paramContext, Bitmap paramBitmap)
  {
    GMTrace.i(6970463485952L, 51934);
    if (paramBitmap == null)
    {
      GMTrace.o(6970463485952L, 51934);
      return null;
    }
    try
    {
      byte[] arrayOfByte = paramBitmap.getNinePatchChunk();
      if (NinePatch.isNinePatchChunk(arrayOfByte))
      {
        paramContext = new NinePatchDrawable(paramContext.getResources(), paramBitmap, arrayOfByte, new Rect(), null);
        paramContext.setBounds(0, 0, paramBitmap.getWidth(), paramBitmap.getHeight());
        GMTrace.o(6970463485952L, 51934);
        return paramContext;
      }
      paramContext = new BitmapDrawable(paramBitmap);
      GMTrace.o(6970463485952L, 51934);
      return paramContext;
    }
    catch (Exception paramContext)
    {
      w.f("MicroMsg.BankcardListAdapter", paramContext.getMessage());
      w.printErrStackTrace("MicroMsg.BankcardListAdapter", paramContext, "", new Object[0]);
      GMTrace.o(6970463485952L, 51934);
    }
    return null;
  }
  
  static final class a
    implements j.a
  {
    public TextView qWh;
    public TextView qWi;
    public TextView qWj;
    public ImageView qWl;
    public ImageView qWm;
    public TextView qWn;
    public TextView qWo;
    public TextView qWp;
    public ViewGroup rqj;
    public e rqk;
    public ViewGroup rql;
    public TextView rqm;
    public ImageView rqn;
    
    a()
    {
      GMTrace.i(6966436954112L, 51904);
      this.qWh = null;
      this.qWi = null;
      this.qWj = null;
      this.rqj = null;
      this.qWl = null;
      this.qWm = null;
      this.qWn = null;
      this.qWo = null;
      this.qWp = null;
      this.rql = null;
      this.rqm = null;
      this.rqn = null;
      GMTrace.o(6966436954112L, 51904);
    }
    
    public final void k(String paramString, final Bitmap paramBitmap)
    {
      GMTrace.i(6966571171840L, 51905);
      StringBuilder localStringBuilder = new StringBuilder().append(paramString).append(", bitmap = ");
      if (paramBitmap == null) {}
      for (boolean bool = true;; bool = false)
      {
        w.d("MicroMsg.BankcardListAdapter", bool);
        if (this.rqk != null) {
          break;
        }
        GMTrace.o(6966571171840L, 51905);
        return;
      }
      if (paramString.equals(this.rqk.nvc)) {
        this.qWm.post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(6965497430016L, 51897);
            b.a.this.qWm.setImageBitmap(paramBitmap);
            b.a.this.rqj.invalidate();
            GMTrace.o(6965497430016L, 51897);
          }
        });
      }
      if ((paramString.equals(this.rqk.reV)) && (this.qWl != null)) {
        this.qWl.post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(6965765865472L, 51899);
            b.a.this.qWl.setImageBitmap(paramBitmap);
            GMTrace.o(6965765865472L, 51899);
          }
        });
      }
      GMTrace.o(6966571171840L, 51905);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet_core\ui\view\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */