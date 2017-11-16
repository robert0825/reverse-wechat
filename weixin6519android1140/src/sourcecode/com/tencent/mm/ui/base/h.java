package com.tencent.mm.ui.base;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Resources;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.jg.JgClassChecked;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.tools.a.c;
import com.tencent.mm.ui.tools.l;
import com.tencent.mm.ui.widget.MMEditText;
import com.tencent.mm.ui.widget.f;
import com.tencent.mm.v.a.e;
import com.tencent.mm.v.a.f;
import com.tencent.mm.v.a.g;
import com.tencent.mm.v.a.h;
import com.tencent.mm.v.a.j;
import com.tencent.mm.v.a.k;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@JgClassChecked(author=20, fComment="checked", lastDate="201400504", reviewer=20, vComment={com.jg.EType.JSEXECUTECHECK})
public final class h
{
  private static Toast wal;
  
  public static i A(Context paramContext, String paramString1, String paramString2)
  {
    GMTrace.i(3248740106240L, 24205);
    paramContext = b(paramContext, paramString1, paramString2, true);
    GMTrace.o(3248740106240L, 24205);
    return paramContext;
  }
  
  public static Dialog a(Context paramContext, String paramString, List<String> paramList, List<Integer> paramList1, d paramd)
  {
    GMTrace.i(3253571944448L, 24241);
    paramContext = b(paramContext, paramString, paramList, paramList1, null, true, paramd);
    GMTrace.o(3253571944448L, 24241);
    return paramContext;
  }
  
  public static Dialog a(Context paramContext, String paramString1, List<String> paramList, List<Integer> paramList1, String paramString2, d paramd)
  {
    GMTrace.i(3253303508992L, 24239);
    paramContext = b(paramContext, paramString1, paramList, paramList1, paramString2, true, paramd);
    GMTrace.o(3253303508992L, 24239);
    return paramContext;
  }
  
  public static Dialog a(Context paramContext, String paramString1, List<String> paramList, List<Integer> paramList1, String paramString2, boolean paramBoolean, d paramd)
  {
    GMTrace.i(3253437726720L, 24240);
    paramContext = b(paramContext, paramString1, paramList, paramList1, paramString2, paramBoolean, paramd);
    GMTrace.o(3253437726720L, 24240);
    return paramContext;
  }
  
  public static Dialog a(Context paramContext, String paramString, String[] paramArrayOfString, c paramc)
  {
    GMTrace.i(3253840379904L, 24243);
    paramContext = a(paramContext, paramString, paramArrayOfString, null, true, paramc, null);
    GMTrace.o(3253840379904L, 24243);
    return paramContext;
  }
  
  public static Dialog a(Context paramContext, String paramString1, String[] paramArrayOfString, String paramString2, c paramc)
  {
    GMTrace.i(3253974597632L, 24244);
    paramContext = a(paramContext, paramString1, paramArrayOfString, paramString2, true, paramc, null);
    GMTrace.o(3253974597632L, 24244);
    return paramContext;
  }
  
  public static Dialog a(Context paramContext, String paramString1, String[] paramArrayOfString, String paramString2, c paramc, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    GMTrace.i(3254243033088L, 24246);
    paramContext = a(paramContext, paramString1, paramArrayOfString, paramString2, true, paramc, paramOnCancelListener);
    GMTrace.o(3254243033088L, 24246);
    return paramContext;
  }
  
  public static Dialog a(Context paramContext, String paramString1, String[] paramArrayOfString, String paramString2, boolean paramBoolean, c paramc)
  {
    GMTrace.i(3254108815360L, 24245);
    paramContext = a(paramContext, paramString1, paramArrayOfString, paramString2, paramBoolean, paramc, null);
    GMTrace.o(3254108815360L, 24245);
    return paramContext;
  }
  
  @Deprecated
  public static Dialog a(Context paramContext, String paramString1, String[] paramArrayOfString, String paramString2, boolean paramBoolean, c paramc, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    GMTrace.i(3254377250816L, 24247);
    if (((paramContext instanceof Activity)) && (((Activity)paramContext).isFinishing()))
    {
      GMTrace.o(3254377250816L, 24247);
      return null;
    }
    if (((paramArrayOfString == null) || (paramArrayOfString.length == 0)) && (bg.nm(paramString2)))
    {
      GMTrace.o(3254377250816L, 24247);
      return null;
    }
    final ArrayList localArrayList = new ArrayList();
    if ((paramArrayOfString != null) && (paramArrayOfString.length > 0)) {
      Collections.addAll(localArrayList, paramArrayOfString);
    }
    if (!bg.nm(paramString2)) {
      localArrayList.add(paramString2);
    }
    if (paramBoolean)
    {
      paramArrayOfString = new l(paramContext);
      paramArrayOfString.qik = new p.c()
      {
        public final void a(n paramAnonymousn)
        {
          GMTrace.i(3337189588992L, 24864);
          paramAnonymousn.setHeaderTitle(this.hjn);
          int i = 0;
          while (i < localArrayList.size())
          {
            paramAnonymousn.e(i, (CharSequence)localArrayList.get(i));
            i += 1;
          }
          GMTrace.o(3337189588992L, 24864);
        }
      };
      paramArrayOfString.qil = new p.d()
      {
        public final void c(MenuItem paramAnonymousMenuItem, int paramAnonymousInt)
        {
          GMTrace.i(3287394811904L, 24493);
          if (this.wao != null) {
            this.wao.hQ(paramAnonymousMenuItem.getItemId());
          }
          GMTrace.o(3287394811904L, 24493);
        }
      };
      paramArrayOfString.e(paramOnCancelListener);
      paramString1 = paramArrayOfString.bpI();
      a(paramContext, paramString1);
      GMTrace.o(3254377250816L, 24247);
      return paramString1;
    }
    paramContext = new f(paramContext, f.xpQ, false);
    paramContext.qik = new p.c()
    {
      public final void a(n paramAnonymousn)
      {
        GMTrace.i(3281891885056L, 24452);
        paramAnonymousn.setHeaderTitle(this.hjn);
        int i = 0;
        while (i < localArrayList.size())
        {
          paramAnonymousn.e(i, (CharSequence)localArrayList.get(i));
          i += 1;
        }
        GMTrace.o(3281891885056L, 24452);
      }
    };
    paramContext.qil = new p.d()
    {
      public final void c(MenuItem paramAnonymousMenuItem, int paramAnonymousInt)
      {
        GMTrace.i(3184181379072L, 23724);
        if (this.wao != null) {
          this.wao.hQ(paramAnonymousMenuItem.getItemId());
        }
        GMTrace.o(3184181379072L, 23724);
      }
    };
    paramContext.bFk();
    GMTrace.o(3254377250816L, 24247);
    return null;
  }
  
  public static i a(Context paramContext, int paramInt1, int paramInt2, int paramInt3, int paramInt4, DialogInterface.OnClickListener paramOnClickListener1, DialogInterface.OnClickListener paramOnClickListener2)
  {
    GMTrace.i(3251021807616L, 24222);
    if (((paramContext instanceof Activity)) && (((Activity)paramContext).isFinishing()))
    {
      GMTrace.o(3251021807616L, 24222);
      return null;
    }
    i.a locala = new i.a(paramContext);
    if (paramInt2 != 0) {
      locala.BN(paramInt2);
    }
    locala.BO(paramInt1);
    locala.BQ(paramInt3).a(paramOnClickListener1);
    locala.BR(paramInt4).b(paramOnClickListener2);
    locala.d(new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(3277865353216L, 24422);
        if (this.rHW != null) {
          this.rHW.onClick(paramAnonymousDialogInterface, 0);
        }
        GMTrace.o(3277865353216L, 24422);
      }
    });
    paramOnClickListener1 = locala.aax();
    paramOnClickListener1.show();
    a(paramContext, paramOnClickListener1);
    GMTrace.o(3251021807616L, 24222);
    return paramOnClickListener1;
  }
  
  public static i a(Context paramContext, int paramInt1, int paramInt2, int paramInt3, int paramInt4, DialogInterface.OnClickListener paramOnClickListener1, DialogInterface.OnClickListener paramOnClickListener2, int paramInt5)
  {
    GMTrace.i(3250887589888L, 24221);
    String str1;
    if (paramInt1 > 0)
    {
      str1 = paramContext.getString(paramInt1);
      if (paramInt2 <= 0) {
        break label76;
      }
    }
    label76:
    for (String str2 = paramContext.getString(paramInt2);; str2 = "")
    {
      paramContext = a(paramContext, str1, str2, paramContext.getString(paramInt3), paramContext.getString(paramInt4), false, paramOnClickListener1, paramOnClickListener2, paramInt5);
      GMTrace.o(3250887589888L, 24221);
      return paramContext;
      str1 = "";
      break;
    }
  }
  
  public static i a(Context paramContext, int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean, DialogInterface.OnClickListener paramOnClickListener1, DialogInterface.OnClickListener paramOnClickListener2)
  {
    GMTrace.i(3250753372160L, 24220);
    String str1;
    if (paramInt1 > 0)
    {
      str1 = paramContext.getString(paramInt1);
      if (paramInt2 <= 0) {
        break label75;
      }
    }
    label75:
    for (String str2 = paramContext.getString(paramInt2);; str2 = "")
    {
      paramContext = a(paramContext, str1, str2, paramContext.getString(paramInt3), paramContext.getString(paramInt4), paramBoolean, paramOnClickListener1, paramOnClickListener2);
      GMTrace.o(3250753372160L, 24220);
      return paramContext;
      str1 = "";
      break;
    }
  }
  
  public static i a(Context paramContext, int paramInt1, int paramInt2, DialogInterface.OnClickListener paramOnClickListener)
  {
    GMTrace.i(3249142759424L, 24208);
    paramContext = a(paramContext, paramInt1, paramInt2, true, paramOnClickListener);
    GMTrace.o(3249142759424L, 24208);
    return paramContext;
  }
  
  public static i a(Context paramContext, int paramInt1, int paramInt2, DialogInterface.OnClickListener paramOnClickListener1, DialogInterface.OnClickListener paramOnClickListener2)
  {
    GMTrace.i(3250484936704L, 24218);
    String str1;
    if (paramInt1 > 0)
    {
      str1 = paramContext.getString(paramInt1);
      if (paramInt2 <= 0) {
        break label61;
      }
    }
    label61:
    for (String str2 = paramContext.getString(paramInt2);; str2 = "")
    {
      paramContext = a(paramContext, str1, str2, paramOnClickListener1, paramOnClickListener2);
      GMTrace.o(3250484936704L, 24218);
      return paramContext;
      str1 = "";
      break;
    }
  }
  
  public static i a(Context paramContext, int paramInt1, int paramInt2, boolean paramBoolean, DialogInterface.OnClickListener paramOnClickListener)
  {
    GMTrace.i(3249276977152L, 24209);
    if (((paramContext instanceof Activity)) && (((Activity)paramContext).isFinishing()))
    {
      GMTrace.o(3249276977152L, 24209);
      return null;
    }
    i.a locala = new i.a(paramContext);
    if (paramInt2 > 0) {
      locala.BN(paramInt2);
    }
    locala.BO(paramInt1);
    locala.BQ(a.k.cTM).a(paramOnClickListener);
    locala.lz(paramBoolean);
    paramOnClickListener = locala.aax();
    paramOnClickListener.show();
    a(paramContext, paramOnClickListener);
    GMTrace.o(3249276977152L, 24209);
    return paramOnClickListener;
  }
  
  public static i a(Context paramContext, String paramString, View paramView, DialogInterface.OnClickListener paramOnClickListener)
  {
    GMTrace.i(3251692896256L, 24227);
    if (((paramContext instanceof Activity)) && (((Activity)paramContext).isFinishing()))
    {
      GMTrace.o(3251692896256L, 24227);
      return null;
    }
    i.a locala = new i.a(paramContext);
    locala.Vz(paramString);
    locala.dg(paramView);
    locala.BQ(a.k.cTM).a(paramOnClickListener);
    paramString = locala.aax();
    paramString.show();
    a(paramContext, paramString);
    GMTrace.o(3251692896256L, 24227);
    return paramString;
  }
  
  public static i a(Context paramContext, String paramString, View paramView, DialogInterface.OnClickListener paramOnClickListener1, DialogInterface.OnClickListener paramOnClickListener2)
  {
    GMTrace.i(3252363984896L, 24232);
    if (((paramContext instanceof Activity)) && (((Activity)paramContext).isFinishing()))
    {
      GMTrace.o(3252363984896L, 24232);
      return null;
    }
    i.a locala = new i.a(paramContext);
    locala.Vz(paramString);
    locala.VA(null);
    locala.dg(paramView);
    locala.BQ(a.k.cTM).a(paramOnClickListener1);
    locala.BR(a.k.cSk).b(paramOnClickListener2);
    locala.d(new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(3201227030528L, 23851);
        if (this.rHW != null) {
          this.rHW.onClick(paramAnonymousDialogInterface, 0);
        }
        GMTrace.o(3201227030528L, 23851);
      }
    });
    paramString = locala.aax();
    paramString.show();
    a(paramContext, paramString);
    GMTrace.o(3252363984896L, 24232);
    return paramString;
  }
  
  public static i a(Context paramContext, String paramString1, View paramView, String paramString2, String paramString3, DialogInterface.OnClickListener paramOnClickListener1, DialogInterface.OnClickListener paramOnClickListener2)
  {
    GMTrace.i(3251827113984L, 24228);
    paramContext = a(paramContext, true, paramString1, paramView, paramString2, paramString3, paramOnClickListener1, paramOnClickListener2);
    GMTrace.o(3251827113984L, 24228);
    return paramContext;
  }
  
  public static i a(Context paramContext, String paramString1, String paramString2, DialogInterface.OnClickListener paramOnClickListener)
  {
    GMTrace.i(3249411194880L, 24210);
    paramContext = a(paramContext, paramString1, paramString2, true, paramOnClickListener);
    GMTrace.o(3249411194880L, 24210);
    return paramContext;
  }
  
  public static i a(Context paramContext, String paramString1, String paramString2, DialogInterface.OnClickListener paramOnClickListener, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    GMTrace.i(3252766638080L, 24235);
    if (((paramContext instanceof Activity)) && (((Activity)paramContext).isFinishing()))
    {
      GMTrace.o(3252766638080L, 24235);
      return null;
    }
    i.a locala = new i.a(paramContext);
    locala.Vz(paramString2);
    locala.VA(paramString1);
    locala.BQ(a.k.cTM).a(paramOnClickListener);
    locala.d(paramOnCancelListener);
    paramString1 = locala.aax();
    paramString1.show();
    a(paramContext, paramString1);
    GMTrace.o(3252766638080L, 24235);
    return paramString1;
  }
  
  public static i a(Context paramContext, String paramString1, String paramString2, DialogInterface.OnClickListener paramOnClickListener1, DialogInterface.OnClickListener paramOnClickListener2)
  {
    GMTrace.i(3249948065792L, 24214);
    if (((paramContext instanceof Activity)) && (((Activity)paramContext).isFinishing()))
    {
      GMTrace.o(3249948065792L, 24214);
      return null;
    }
    i.a locala = new i.a(paramContext);
    locala.Vz(paramString2);
    locala.VA(paramString1);
    locala.BQ(a.k.cTM).a(paramOnClickListener1);
    locala.BR(a.k.cSk).b(paramOnClickListener2);
    paramString1 = locala.aax();
    paramString1.show();
    a(paramContext, paramString1);
    GMTrace.o(3249948065792L, 24214);
    return paramString1;
  }
  
  public static i a(Context paramContext, String paramString1, String paramString2, View paramView, DialogInterface.OnClickListener paramOnClickListener)
  {
    GMTrace.i(3252229767168L, 24231);
    if (((paramContext instanceof Activity)) && (((Activity)paramContext).isFinishing()))
    {
      GMTrace.o(3252229767168L, 24231);
      return null;
    }
    i.a locala = new i.a(paramContext);
    locala.Vz(paramString1);
    locala.dg(paramView);
    locala.VC(paramString2).a(paramOnClickListener);
    paramString1 = locala.aax();
    paramString1.show();
    a(paramContext, paramString1);
    GMTrace.o(3252229767168L, 24231);
    return paramString1;
  }
  
  public static i a(final Context paramContext, String paramString1, String paramString2, String paramString3, int paramInt, b paramb)
  {
    GMTrace.i(3252498202624L, 24233);
    if (((paramContext instanceof Activity)) && (((Activity)paramContext).isFinishing()))
    {
      GMTrace.o(3252498202624L, 24233);
      return null;
    }
    i.a locala = new i.a(paramContext);
    locala.lz(false);
    locala.lA(true);
    locala.BR(a.k.cSk).b(null);
    locala.Vz(paramString1);
    paramString1 = View.inflate(paramContext, a.h.gfb, null);
    final MMEditText localMMEditText = (MMEditText)paramString1.findViewById(a.g.bvB);
    if (!bg.nm(paramString2)) {
      localMMEditText.Xi(paramString2);
    }
    paramString2 = (TextView)paramString1.findViewById(a.g.chF);
    if (bg.nm(paramString3)) {
      paramString2.setVisibility(8);
    }
    for (;;)
    {
      locala.BQ(a.k.cTM).a(false, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(3153848172544L, 23498);
          boolean bool = true;
          if (this.rqg != null) {
            bool = this.rqg.v(localMMEditText.getText().toString().trim());
          }
          if (bool)
          {
            paramAnonymousDialogInterface.dismiss();
            if ((paramContext instanceof MMActivity)) {
              af.t(new Runnable()
              {
                public final void run()
                {
                  GMTrace.i(3153445519360L, 23495);
                  ((MMActivity)h.12.this.val$context).aLo();
                  GMTrace.o(3153445519360L, 23495);
                }
              });
            }
          }
          GMTrace.o(3153848172544L, 23498);
        }
      });
      if (paramInt > 0) {
        c.d(localMMEditText).Ea(paramInt).a(null);
      }
      locala.dg(paramString1);
      paramString2 = locala.aax();
      paramString2.show();
      a(paramContext, paramString2);
      if ((paramContext instanceof MMActivity)) {
        paramString1.post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(3308735430656L, 24652);
            ((MMActivity)this.val$context).aLs();
            GMTrace.o(3308735430656L, 24652);
          }
        });
      }
      GMTrace.o(3252498202624L, 24233);
      return paramString2;
      paramString2.setText(paramString3);
    }
  }
  
  public static i a(Context paramContext, String paramString1, String paramString2, String paramString3, DialogInterface.OnClickListener paramOnClickListener)
  {
    GMTrace.i(3249679630336L, 24212);
    paramContext = a(paramContext, paramString1, paramString2, paramString3, true, paramOnClickListener);
    GMTrace.o(3249679630336L, 24212);
    return paramContext;
  }
  
  public static i a(Context paramContext, String paramString1, String paramString2, String paramString3, String paramString4, DialogInterface.OnClickListener paramOnClickListener1, DialogInterface.OnClickListener paramOnClickListener2)
  {
    GMTrace.i(3251156025344L, 24223);
    if (((paramContext instanceof Activity)) && (((Activity)paramContext).isFinishing()))
    {
      GMTrace.o(3251156025344L, 24223);
      return null;
    }
    i.a locala = new i.a(paramContext);
    locala.Vz(paramString2);
    locala.VA(paramString1);
    locala.VC(paramString3).a(paramOnClickListener1);
    locala.VD(paramString4).b(paramOnClickListener2);
    paramString1 = locala.aax();
    paramString1.show();
    a(paramContext, paramString1);
    GMTrace.o(3251156025344L, 24223);
    return paramString1;
  }
  
  public static i a(Context paramContext, String paramString1, String paramString2, String paramString3, String paramString4, DialogInterface.OnClickListener paramOnClickListener1, DialogInterface.OnClickListener paramOnClickListener2, int paramInt)
  {
    GMTrace.i(3251290243072L, 24224);
    if (((paramContext instanceof Activity)) && (((Activity)paramContext).isFinishing()))
    {
      GMTrace.o(3251290243072L, 24224);
      return null;
    }
    i.a locala = new i.a(paramContext);
    locala.Vz(paramString2);
    locala.VA(paramString1);
    locala.VC(paramString3).a(paramOnClickListener1);
    locala.VD(paramString4).b(paramOnClickListener2);
    paramString1 = locala.aax();
    paramString1.BL(paramContext.getResources().getColor(paramInt));
    paramString1.show();
    a(paramContext, paramString1);
    GMTrace.o(3251290243072L, 24224);
    return paramString1;
  }
  
  public static i a(Context paramContext, String paramString1, String paramString2, String paramString3, String paramString4, boolean paramBoolean, DialogInterface.OnClickListener paramOnClickListener1, DialogInterface.OnClickListener paramOnClickListener2)
  {
    GMTrace.i(3250216501248L, 24216);
    paramContext = a(paramContext, paramString1, paramString2, paramString3, paramString4, paramBoolean, paramOnClickListener1, paramOnClickListener2, -1);
    GMTrace.o(3250216501248L, 24216);
    return paramContext;
  }
  
  public static i a(Context paramContext, String paramString1, String paramString2, String paramString3, String paramString4, boolean paramBoolean, DialogInterface.OnClickListener paramOnClickListener1, DialogInterface.OnClickListener paramOnClickListener2, int paramInt)
  {
    GMTrace.i(3250350718976L, 24217);
    if (((paramContext instanceof Activity)) && (((Activity)paramContext).isFinishing()))
    {
      GMTrace.o(3250350718976L, 24217);
      return null;
    }
    i.a locala = new i.a(paramContext);
    locala.Vz(paramString2);
    locala.VA(paramString1);
    locala.VC(paramString3).a(paramOnClickListener1);
    locala.VD(paramString4).b(paramOnClickListener2);
    locala.lz(paramBoolean);
    paramString1 = locala.aax();
    if (paramInt > 0) {
      paramString1.BL(paramContext.getResources().getColor(paramInt));
    }
    paramString1.show();
    a(paramContext, paramString1);
    GMTrace.o(3250350718976L, 24217);
    return paramString1;
  }
  
  public static i a(Context paramContext, String paramString1, String paramString2, String paramString3, boolean paramBoolean, DialogInterface.OnClickListener paramOnClickListener)
  {
    GMTrace.i(3249813848064L, 24213);
    if (((paramContext instanceof Activity)) && (((Activity)paramContext).isFinishing()))
    {
      GMTrace.o(3249813848064L, 24213);
      return null;
    }
    i.a locala = new i.a(paramContext);
    locala.Vz(paramString2);
    locala.VA(paramString1);
    locala.VC(paramString3).a(paramOnClickListener);
    locala.lz(paramBoolean);
    paramString1 = locala.aax();
    paramString1.show();
    a(paramContext, paramString1);
    GMTrace.o(3249813848064L, 24213);
    return paramString1;
  }
  
  public static i a(Context paramContext, String paramString1, String paramString2, boolean paramBoolean, DialogInterface.OnClickListener paramOnClickListener)
  {
    GMTrace.i(3249545412608L, 24211);
    if (((paramContext instanceof Activity)) && (((Activity)paramContext).isFinishing()))
    {
      GMTrace.o(3249545412608L, 24211);
      return null;
    }
    i.a locala = new i.a(paramContext);
    locala.Vz(paramString2);
    locala.VA(paramString1);
    locala.BQ(a.k.cTM).a(paramOnClickListener);
    locala.lz(paramBoolean);
    paramString1 = locala.aax();
    paramString1.show();
    a(paramContext, paramString1);
    GMTrace.o(3249545412608L, 24211);
    return paramString1;
  }
  
  public static i a(Context paramContext, String paramString1, String paramString2, boolean paramBoolean, DialogInterface.OnClickListener paramOnClickListener1, DialogInterface.OnClickListener paramOnClickListener2)
  {
    GMTrace.i(3250082283520L, 24215);
    if (((paramContext instanceof Activity)) && (((Activity)paramContext).isFinishing()))
    {
      GMTrace.o(3250082283520L, 24215);
      return null;
    }
    i.a locala = new i.a(paramContext);
    locala.Vz(paramString2);
    locala.VA(paramString1);
    locala.BQ(a.k.cTM).a(paramOnClickListener1);
    locala.BR(a.k.cSk).b(paramOnClickListener2);
    locala.lz(paramBoolean);
    paramString1 = locala.aax();
    paramString1.show();
    a(paramContext, paramString1);
    GMTrace.o(3250082283520L, 24215);
    return paramString1;
  }
  
  public static i a(Context paramContext, String paramString, List<String> paramList, int paramInt, final a parama)
  {
    GMTrace.i(3252632420352L, 24234);
    if (((paramContext instanceof Activity)) && (((Activity)paramContext).isFinishing()))
    {
      GMTrace.o(3252632420352L, 24234);
      return null;
    }
    if (paramList.isEmpty())
    {
      w.w("MicroMsg.MMAlert", "show switch alert fail");
      GMTrace.o(3252632420352L, 24234);
      return null;
    }
    i.a locala = new i.a(paramContext);
    locala.lz(false);
    locala.BR(a.k.cSk);
    locala.Vz(paramString);
    View localView = View.inflate(paramContext, a.h.cBv, null);
    paramString = (LinearLayout)localView.findViewById(a.g.cgk);
    int i = paramList.size() - 1;
    while (i >= 0)
    {
      TextView localTextView = (TextView)View.inflate(paramContext, a.h.cEd, null);
      localTextView.setText((CharSequence)paramList.get(i));
      if (i == paramInt) {
        localTextView.setCompoundDrawablesWithIntrinsicBounds(a.j.cOv, 0, 0, 0);
      }
      if (i == paramList.size() - 1)
      {
        paramContext.getResources().getDimensionPixelSize(a.e.aQE);
        localTextView.setBackgroundResource(a.f.baI);
      }
      localTextView.setTag(Integer.valueOf(i));
      paramString.addView(localTextView, 0);
      localTextView.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(3200287506432L, 23844);
          int i = 0;
          while (i < this.oHR.getChildCount())
          {
            TextView localTextView = (TextView)this.oHR.getChildAt(i);
            if (localTextView.getId() != a.g.chF) {
              localTextView.setCompoundDrawablesWithIntrinsicBounds(a.j.cOu, 0, 0, 0);
            }
            i += 1;
          }
          ((TextView)paramAnonymousView).setCompoundDrawablesWithIntrinsicBounds(a.j.cOv, 0, 0, 0);
          paramAnonymousView.post(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(3331015573504L, 24818);
              ((Dialog)h.14.this.oHR.getTag()).dismiss();
              if (h.14.this.war != null) {
                h.14.this.war.te(this.was);
              }
              GMTrace.o(3331015573504L, 24818);
            }
          });
          GMTrace.o(3200287506432L, 23844);
        }
      });
      i -= 1;
    }
    locala.dg(localView);
    paramList = locala.aax();
    paramString.setTag(paramList);
    paramList.show();
    a(paramContext, paramList);
    GMTrace.o(3252632420352L, 24234);
    return paramList;
  }
  
  public static i a(Context paramContext, boolean paramBoolean, String paramString1, View paramView, String paramString2, String paramString3, DialogInterface.OnClickListener paramOnClickListener1, DialogInterface.OnClickListener paramOnClickListener2)
  {
    GMTrace.i(3251961331712L, 24229);
    paramContext = a(paramContext, paramBoolean, paramString1, paramView, paramString2, paramString3, paramOnClickListener1, paramOnClickListener2, -1);
    GMTrace.o(3251961331712L, 24229);
    return paramContext;
  }
  
  public static i a(Context paramContext, boolean paramBoolean, String paramString1, View paramView, String paramString2, String paramString3, DialogInterface.OnClickListener paramOnClickListener1, DialogInterface.OnClickListener paramOnClickListener2, int paramInt)
  {
    GMTrace.i(3252095549440L, 24230);
    if (((paramContext instanceof Activity)) && (((Activity)paramContext).isFinishing()))
    {
      GMTrace.o(3252095549440L, 24230);
      return null;
    }
    i.a locala = new i.a(paramContext);
    locala.Vz(paramString1);
    locala.dg(paramView);
    locala.VC(paramString2).a(paramOnClickListener1);
    locala.VD(paramString3).b(paramOnClickListener2);
    locala.lz(paramBoolean);
    paramString1 = locala.aax();
    if (paramInt > 0) {
      paramString1.BL(paramContext.getResources().getColor(paramInt));
    }
    paramString1.show();
    a(paramContext, paramString1);
    GMTrace.o(3252095549440L, 24230);
    return paramString1;
  }
  
  public static i a(Context paramContext, boolean paramBoolean, String paramString1, String paramString2, String paramString3, String paramString4, DialogInterface.OnClickListener paramOnClickListener1, DialogInterface.OnClickListener paramOnClickListener2)
  {
    GMTrace.i(3251424460800L, 24225);
    if (((paramContext instanceof Activity)) && (((Activity)paramContext).isFinishing()))
    {
      GMTrace.o(3251424460800L, 24225);
      return null;
    }
    i.a locala = new i.a(paramContext);
    locala.Vz(paramString2);
    locala.VA(paramString1);
    locala.VC(paramString3).a(paramOnClickListener1);
    locala.VD(paramString4).b(paramOnClickListener2);
    locala.lz(paramBoolean);
    paramString1 = locala.aax();
    paramString1.show();
    a(paramContext, paramString1);
    GMTrace.o(3251424460800L, 24225);
    return paramString1;
  }
  
  public static i a(Context paramContext, boolean paramBoolean, String paramString1, String paramString2, String paramString3, String paramString4, DialogInterface.OnClickListener paramOnClickListener1, DialogInterface.OnClickListener paramOnClickListener2, int paramInt1, int paramInt2)
  {
    GMTrace.i(20356265934848L, 151666);
    if (((paramContext instanceof Activity)) && (((Activity)paramContext).isFinishing()))
    {
      GMTrace.o(20356265934848L, 151666);
      return null;
    }
    i.a locala = new i.a(paramContext);
    locala.Vz(paramString2);
    locala.VA(paramString1);
    locala.VC(paramString3).a(paramOnClickListener1);
    locala.VD(paramString4).b(paramOnClickListener2);
    locala.lz(paramBoolean);
    paramString1 = locala.aax();
    if (paramInt1 > 0) {
      paramString1.BL(paramContext.getResources().getColor(paramInt1));
    }
    if (paramInt2 > 0) {
      paramString1.BM(paramContext.getResources().getColor(paramInt2));
    }
    paramString1.show();
    a(paramContext, paramString1);
    GMTrace.o(20356265934848L, 151666);
    return paramString1;
  }
  
  private static r a(Context paramContext, int paramInt, String paramString, boolean paramBoolean, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    GMTrace.i(3253169291264L, 24238);
    if (((paramContext instanceof Activity)) && (((Activity)paramContext).isFinishing()))
    {
      GMTrace.o(3253169291264L, 24238);
      return null;
    }
    ac.a(true, null);
    paramString = r.b(paramContext, paramString, paramBoolean, paramInt, new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(3158277357568L, 23531);
        DialogInterface.OnCancelListener localOnCancelListener = (DialogInterface.OnCancelListener)this.wau.get();
        if (localOnCancelListener != null) {
          localOnCancelListener.onCancel(paramAnonymousDialogInterface);
        }
        ac.a(false, null);
        GMTrace.o(3158277357568L, 23531);
      }
    });
    a(paramContext, paramString);
    GMTrace.o(3253169291264L, 24238);
    return paramString;
  }
  
  public static r a(Context paramContext, String paramString, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    GMTrace.i(3253035073536L, 24237);
    paramContext = a(paramContext, 2, paramString, true, paramOnCancelListener);
    GMTrace.o(3253035073536L, 24237);
    return paramContext;
  }
  
  public static r a(Context paramContext, String paramString, boolean paramBoolean, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    GMTrace.i(3252900855808L, 24236);
    paramContext = a(paramContext, 0, paramString, paramBoolean, paramOnCancelListener);
    GMTrace.o(3252900855808L, 24236);
    return paramContext;
  }
  
  public static void a(Context paramContext, Dialog paramDialog)
  {
    GMTrace.i(3248203235328L, 24201);
    if ((paramContext instanceof MMActivity)) {
      ((MMActivity)paramContext).a(paramDialog);
    }
    GMTrace.o(3248203235328L, 24201);
  }
  
  @Deprecated
  private static Dialog b(Context paramContext, String paramString1, List<String> paramList, final List<Integer> paramList1, final String paramString2, boolean paramBoolean, d paramd)
  {
    GMTrace.i(3253706162176L, 24242);
    if (((paramList == null) || (paramList.size() == 0)) && (bg.nm(paramString2)))
    {
      GMTrace.o(3253706162176L, 24242);
      return null;
    }
    final Object localObject = paramList;
    if (paramList == null) {
      localObject = new ArrayList();
    }
    if (paramBoolean)
    {
      paramList = new l(paramContext);
      paramList.qik = new p.c()
      {
        public final void a(n paramAnonymousn)
        {
          GMTrace.i(3315446317056L, 24702);
          if (!bg.nm(this.hjn)) {
            paramAnonymousn.setHeaderTitle(this.hjn);
          }
          int i = 0;
          while (i < localObject.size())
          {
            paramAnonymousn.e(((Integer)paramList1.get(i)).intValue(), (CharSequence)localObject.get(i));
            i += 1;
          }
          if (!bg.nm(paramString2)) {
            paramAnonymousn.e(-1, paramString2);
          }
          GMTrace.o(3315446317056L, 24702);
        }
      };
      paramList.qil = new p.d()
      {
        public final void c(MenuItem paramAnonymousMenuItem, int paramAnonymousInt)
        {
          GMTrace.i(3176262533120L, 23665);
          if (this.wan != null) {
            this.wan.bT(paramAnonymousInt, paramAnonymousMenuItem.getItemId());
          }
          GMTrace.o(3176262533120L, 23665);
        }
      };
      paramList.e(null);
      paramString1 = paramList.bpI();
      a(paramContext, paramString1);
      GMTrace.o(3253706162176L, 24242);
      return paramString1;
    }
    paramContext = new f(paramContext, f.xpQ, false);
    paramContext.qik = new p.c()
    {
      public final void a(n paramAnonymousn)
      {
        GMTrace.i(3172370219008L, 23636);
        if (!bg.nm(this.hjn)) {
          paramAnonymousn.setHeaderTitle(this.hjn);
        }
        int i = 0;
        while (i < localObject.size())
        {
          paramAnonymousn.e(((Integer)paramList1.get(i)).intValue(), (CharSequence)localObject.get(i));
          i += 1;
        }
        if (!bg.nm(paramString2)) {
          paramAnonymousn.e(-1, paramString2);
        }
        GMTrace.o(3172370219008L, 23636);
      }
    };
    paramContext.qil = new p.d()
    {
      public final void c(MenuItem paramAnonymousMenuItem, int paramAnonymousInt)
      {
        GMTrace.i(3299205971968L, 24581);
        if (this.wan != null) {
          this.wan.bT(paramAnonymousInt, paramAnonymousMenuItem.getItemId());
        }
        GMTrace.o(3299205971968L, 24581);
      }
    };
    paramContext.bFk();
    GMTrace.o(3253706162176L, 24242);
    return null;
  }
  
  public static i b(Context paramContext, int paramInt1, int paramInt2, DialogInterface.OnClickListener paramOnClickListener1, DialogInterface.OnClickListener paramOnClickListener2)
  {
    GMTrace.i(3250619154432L, 24219);
    String str1;
    if (paramInt1 > 0)
    {
      str1 = paramContext.getString(paramInt1);
      if (paramInt2 <= 0) {
        break label62;
      }
    }
    label62:
    for (String str2 = paramContext.getString(paramInt2);; str2 = "")
    {
      paramContext = a(paramContext, str1, str2, false, paramOnClickListener1, paramOnClickListener2);
      GMTrace.o(3250619154432L, 24219);
      return paramContext;
      str1 = "";
      break;
    }
  }
  
  public static i b(Context paramContext, String paramString1, String paramString2, boolean paramBoolean)
  {
    GMTrace.i(3248874323968L, 24206);
    if (((paramContext instanceof Activity)) && (((Activity)paramContext).isFinishing()))
    {
      GMTrace.o(3248874323968L, 24206);
      return null;
    }
    i.a locala = new i.a(paramContext);
    locala.Vz(paramString2);
    locala.VA(paramString1);
    locala.lz(paramBoolean);
    locala.BQ(a.k.cTM).a(new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(3198542675968L, 23831);
        paramAnonymousDialogInterface.cancel();
        GMTrace.o(3198542675968L, 23831);
      }
    });
    paramString1 = locala.aax();
    paramString1.show();
    a(paramContext, paramString1);
    GMTrace.o(3248874323968L, 24206);
    return paramString1;
  }
  
  public static Toast bj(Context paramContext, String paramString)
  {
    GMTrace.i(3248337453056L, 24202);
    paramContext = bm(paramContext, paramString);
    GMTrace.o(3248337453056L, 24202);
    return paramContext;
  }
  
  public static Toast bk(Context paramContext, String paramString)
  {
    GMTrace.i(3248471670784L, 24203);
    paramContext = bm(paramContext, paramString);
    GMTrace.o(3248471670784L, 24203);
    return paramContext;
  }
  
  public static void bl(Context paramContext, String paramString)
  {
    GMTrace.i(15231296208896L, 113482);
    if (wal == null) {
      wal = Toast.makeText(paramContext, paramString, 0);
    }
    for (;;)
    {
      wal.show();
      GMTrace.o(15231296208896L, 113482);
      return;
      wal.setText(paramString);
    }
  }
  
  public static Toast bm(Context paramContext, String paramString)
  {
    GMTrace.i(3248605888512L, 24204);
    paramContext = Toast.makeText(paramContext, paramString, 0);
    paramContext.show();
    GMTrace.o(3248605888512L, 24204);
    return paramContext;
  }
  
  public static i h(Context paramContext, int paramInt1, int paramInt2)
  {
    GMTrace.i(3249008541696L, 24207);
    String str1;
    if (paramInt1 > 0)
    {
      str1 = paramContext.getString(paramInt1);
      if (paramInt2 <= 0) {
        break label56;
      }
    }
    label56:
    for (String str2 = paramContext.getString(paramInt2);; str2 = "")
    {
      paramContext = b(paramContext, str1, str2, true);
      GMTrace.o(3249008541696L, 24207);
      return paramContext;
      str1 = "";
      break;
    }
  }
  
  public static abstract interface a
  {
    public abstract void te(int paramInt);
  }
  
  public static abstract interface b
  {
    public abstract boolean v(CharSequence paramCharSequence);
  }
  
  public static abstract interface c
  {
    public abstract void hQ(int paramInt);
  }
  
  public static abstract interface d
  {
    public abstract void bT(int paramInt1, int paramInt2);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\base\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */