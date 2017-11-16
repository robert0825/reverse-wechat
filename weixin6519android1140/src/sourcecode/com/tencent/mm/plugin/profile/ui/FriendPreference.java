package com.tencent.mm.plugin.profile.ui;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.c;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.a.o;
import com.tencent.mm.ac.d.a;
import com.tencent.mm.ac.e;
import com.tencent.mm.ac.e.b;
import com.tencent.mm.ac.n;
import com.tencent.mm.g.b.af;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.h.c;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import com.tencent.mm.y.s;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.List;
import junit.framework.Assert;

public class FriendPreference
  extends Preference
  implements d.a
{
  private int ePs;
  public MMActivity ezR;
  private TextView hqi;
  public x iBi;
  private boolean kEu;
  private TextView nNG;
  private ImageView nNH;
  private ImageView nNI;
  public com.tencent.mm.modelfriend.b nNJ;
  private String nNK;
  private long nNL;
  private long nNM;
  private String nNN;
  
  public FriendPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(6776384651264L, 50488);
    this.ezR = ((MMActivity)paramContext);
    init();
    GMTrace.o(6776384651264L, 50488);
  }
  
  public FriendPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(6776518868992L, 50489);
    setLayoutResource(R.i.cBA);
    setWidgetLayoutResource(R.i.cCj);
    init();
    GMTrace.o(6776518868992L, 50489);
  }
  
  private void MP()
  {
    GMTrace.i(6777055739904L, 50493);
    if ((this.iBi == null) || (!this.kEu))
    {
      w.d("MicroMsg.FriendPreference", "initView : contact = " + this.iBi + " bindView = " + this.kEu);
      GMTrace.o(6777055739904L, 50493);
      return;
    }
    Object localObject1;
    Object localObject9;
    Object localObject7;
    if ((this.nNL != -1L) && (new o(this.nNL).longValue() > 0L))
    {
      setWidgetLayoutResource(R.i.cCk);
      if ((this.iBi == null) || (!this.kEu))
      {
        w.d("MicroMsg.FriendPreference", "initView : contact = " + this.iBi + " bindView = " + this.kEu);
        GMTrace.o(6777055739904L, 50493);
        return;
      }
      this.ePs = 2;
      this.hqi.setText(this.mContext.getString(R.l.djz));
      localObject1 = bg.nl(this.nNK);
      localObject1 = (String)localObject1 + " " + new o(this.nNL).longValue();
      this.nNG.setText((CharSequence)localObject1);
      localObject1 = com.tencent.mm.ac.b.X(this.nNL);
      if (localObject1 != null) {
        break label1239;
      }
      localObject9 = null;
      localObject7 = null;
    }
    label447:
    label1081:
    label1236:
    label1239:
    for (;;)
    {
      Bitmap localBitmap;
      try
      {
        localInputStream1 = this.mContext.getResources().openRawResource(R.k.cLT);
        localObject7 = localInputStream1;
        localObject9 = localInputStream1;
        localBitmap = com.tencent.mm.compatible.f.a.decodeStream(localInputStream1);
        localObject7 = localBitmap;
        localObject1 = localObject7;
      }
      catch (Exception localException7)
      {
        InputStream localInputStream1;
        localObject9 = localObject7;
        w.printErrStackTrace("MicroMsg.FriendPreference", localException7, "", new Object[0]);
        if (localObject7 == null) {
          break label1239;
        }
        try
        {
          ((InputStream)localObject7).close();
        }
        catch (Exception localException3)
        {
          w.printErrStackTrace("MicroMsg.FriendPreference", localException3, "", new Object[0]);
        }
        continue;
      }
      finally
      {
        if (localObject9 == null) {
          break label447;
        }
      }
      try
      {
        localInputStream1.close();
        localObject1 = localObject7;
      }
      catch (Exception localException1)
      {
        w.printErrStackTrace("MicroMsg.FriendPreference", localException1, "", new Object[0]);
        localObject2 = localObject7;
        continue;
      }
      if (localObject1 != null)
      {
        localObject7 = Bitmap.createScaledBitmap((Bitmap)localObject1, 48, 48, false);
        if (localObject7 != localObject1) {
          ((Bitmap)localObject1).recycle();
        }
        localObject1 = com.tencent.mm.sdk.platformtools.d.a((Bitmap)localObject7, true, 0.0F);
        this.nNH.setImageBitmap((Bitmap)localObject1);
      }
      at.AR();
      if (!c.isSDCardAvailable()) {
        this.nNH.setBackgroundDrawable(com.tencent.mm.br.a.b(this.ezR, R.k.aVS));
      }
      GMTrace.o(6777055739904L, 50493);
      return;
      try
      {
        Object localObject2;
        ((InputStream)localObject9).close();
        throw ((Throwable)localObject3);
      }
      catch (Exception localException4)
      {
        for (;;)
        {
          w.printErrStackTrace("MicroMsg.FriendPreference", localException4, "", new Object[0]);
        }
      }
      final Object localObject4;
      Object localObject8;
      if (this.nNJ != null)
      {
        setWidgetLayoutResource(R.i.cCd);
        if ((this.iBi == null) || (!this.kEu))
        {
          w.d("MicroMsg.FriendPreference", "initView : contact = " + this.iBi + " bindView = " + this.kEu);
          GMTrace.o(6777055739904L, 50493);
          return;
        }
        if (this.nNJ != null)
        {
          this.ePs = 1;
          this.hqi.setText(this.mContext.getString(R.l.djy));
          localObject4 = bg.nl(this.nNJ.GU()) + " " + bg.nl(this.nNJ.Ha()).replace(" ", "");
          this.nNG.setText((CharSequence)localObject4);
          localObject8 = com.tencent.mm.modelfriend.m.a(this.nNJ.GT(), this.mContext);
          if (localObject8 == null) {
            this.nNH.setImageDrawable(com.tencent.mm.br.a.b(this.ezR, R.k.cLS));
          }
          for (;;)
          {
            at.AR();
            if (!c.yK().TA(this.nNJ.getUsername())) {
              break;
            }
            this.nNI.setOnClickListener(new View.OnClickListener()
            {
              public final void onClick(View paramAnonymousView)
              {
                GMTrace.i(6722563342336L, 50087);
                if ((FriendPreference.this.nNJ != null) && (!bg.nm(FriendPreference.this.nNJ.gsO))) {}
                for (paramAnonymousView = FriendPreference.this.ezR.getResources().getStringArray(R.c.aMu);; paramAnonymousView = FriendPreference.this.ezR.getResources().getStringArray(R.c.aMv))
                {
                  final Object localObject = paramAnonymousView;
                  if (com.tencent.mm.plugin.profile.a.hnI.pw())
                  {
                    paramAnonymousView = bg.g(paramAnonymousView);
                    paramAnonymousView.add(FriendPreference.this.ezR.getResources().getString(R.l.dgN));
                    localObject = (String[])paramAnonymousView.toArray(new String[paramAnonymousView.size()]);
                    g.ork.i(11621, new Object[] { Integer.valueOf(2), Integer.valueOf(3) });
                  }
                  h.a(FriendPreference.this.ezR, null, (String[])localObject, null, new h.c()
                  {
                    public final void hQ(int paramAnonymous2Int)
                    {
                      GMTrace.i(6792356560896L, 50607);
                      switch (paramAnonymous2Int)
                      {
                      }
                      for (;;)
                      {
                        GMTrace.o(6792356560896L, 50607);
                        return;
                        if ((FriendPreference.1.this.nNO == null) || (FriendPreference.1.this.nNO.length() == 0))
                        {
                          GMTrace.o(6792356560896L, 50607);
                          return;
                        }
                        paramAnonymous2Int = FriendPreference.1.this.nNO.lastIndexOf(' ') + 1;
                        if (paramAnonymous2Int > 0)
                        {
                          Object localObject1 = FriendPreference.this;
                          Object localObject2 = FriendPreference.1.this.nNO.substring(paramAnonymous2Int);
                          Object localObject3 = new Intent("android.intent.action.DIAL");
                          ((Intent)localObject3).setFlags(268435456);
                          ((Intent)localObject3).setData(Uri.parse("tel:" + (String)localObject2));
                          ((FriendPreference)localObject1).ezR.startActivity((Intent)localObject3);
                          GMTrace.o(6792356560896L, 50607);
                          return;
                          if ((FriendPreference.1.this.nNO == null) || (FriendPreference.1.this.nNO.length() == 0))
                          {
                            GMTrace.o(6792356560896L, 50607);
                            return;
                          }
                          paramAnonymous2Int = FriendPreference.1.this.nNO.lastIndexOf(' ');
                          localObject1 = FriendPreference.1.this.nNO.substring(0, paramAnonymous2Int);
                          if ((localObject1 == null) || (((String)localObject1).length() == 0))
                          {
                            GMTrace.o(6792356560896L, 50607);
                            return;
                          }
                          s.b(FriendPreference.this.iBi, ((String)localObject1).trim());
                          GMTrace.o(6792356560896L, 50607);
                          return;
                          if ((localObject == null) || (localObject.length <= 2) || (FriendPreference.this.nNJ == null) || (FriendPreference.this.iBi == null))
                          {
                            GMTrace.o(6792356560896L, 50607);
                            return;
                          }
                          if ((FriendPreference.this.nNJ != null) && (!bg.nm(FriendPreference.this.nNJ.gsO)))
                          {
                            localObject1 = FriendPreference.this;
                            localObject2 = FriendPreference.this.iBi.field_username;
                            localObject3 = FriendPreference.this.nNJ.gsO;
                            if ((bg.nm((String)localObject2)) || (bg.nm((String)localObject3)))
                            {
                              Toast.makeText(((Preference)localObject1).mContext, ((Preference)localObject1).mContext.getString(R.l.dkC), 0).show();
                              GMTrace.o(6792356560896L, 50607);
                              return;
                            }
                            n.Dh();
                            Object localObject4 = com.tencent.mm.ac.d.hY((String)localObject2);
                            if (localObject4 != null)
                            {
                              if (((FriendPreference)localObject1).p((String)localObject3, (Bitmap)localObject4))
                              {
                                Toast.makeText(((Preference)localObject1).mContext, ((Preference)localObject1).mContext.getString(R.l.dkE), 0).show();
                                GMTrace.o(6792356560896L, 50607);
                                return;
                              }
                              Toast.makeText(((Preference)localObject1).mContext, ((Preference)localObject1).mContext.getString(R.l.dkC), 0).show();
                              GMTrace.o(6792356560896L, 50607);
                              return;
                            }
                            Toast.makeText(((Preference)localObject1).mContext, ((Preference)localObject1).mContext.getString(R.l.dkD), 0).show();
                            localObject4 = new e();
                            ((e)localObject4).a((String)localObject2, new FriendPreference.2((FriendPreference)localObject1, (e)localObject4, (String)localObject2, (String)localObject3));
                            GMTrace.o(6792356560896L, 50607);
                            return;
                          }
                          localObject1 = new Intent();
                          localObject2 = new Bundle();
                          ((Bundle)localObject2).putInt("fromScene", 2);
                          ((Intent)localObject1).putExtra("reportArgs", (Bundle)localObject2);
                          com.tencent.mm.plugin.profile.a.hnH.k((Intent)localObject1, FriendPreference.this.ezR);
                        }
                      }
                    }
                  });
                  GMTrace.o(6722563342336L, 50087);
                  return;
                }
              }
            });
            GMTrace.o(6777055739904L, 50493);
            return;
            localObject8 = com.tencent.mm.sdk.platformtools.d.a(Bitmap.createScaledBitmap((Bitmap)localObject8, 48, 48, false), true, 0.0F);
            this.nNH.setImageBitmap((Bitmap)localObject8);
          }
          this.nNI.setVisibility(4);
        }
        GMTrace.o(6777055739904L, 50493);
        return;
      }
      if (this.nNM > 0L)
      {
        if ((this.iBi == null) || (!this.kEu))
        {
          w.d("MicroMsg.FriendPreference", "initView : contact = " + this.iBi + " bindView = " + this.kEu);
          GMTrace.o(6777055739904L, 50493);
          return;
        }
        this.ePs = 3;
        this.hqi.setText(this.mContext.getString(R.l.dBD));
        this.nNG.setText(bg.nl(this.iBi.fjb));
        localObject4 = com.tencent.mm.ac.b.hM(this.nNM);
        if (localObject4 != null) {
          break label1236;
        }
        localObject9 = null;
        localObject8 = null;
      }
      for (;;)
      {
        try
        {
          localInputStream2 = this.mContext.getResources().openRawResource(R.k.cLT);
          localObject8 = localInputStream2;
          localObject9 = localInputStream2;
          localBitmap = com.tencent.mm.compatible.f.a.decodeStream(localInputStream2);
          localObject8 = localBitmap;
          localObject4 = localObject8;
        }
        catch (Exception localException8)
        {
          InputStream localInputStream2;
          localObject9 = localObject8;
          w.printErrStackTrace("MicroMsg.FriendPreference", localException8, "", new Object[0]);
          if (localObject8 == null) {
            break label1236;
          }
          try
          {
            ((InputStream)localObject8).close();
          }
          catch (Exception localException5)
          {
            w.printErrStackTrace("MicroMsg.FriendPreference", localException5, "", new Object[0]);
          }
          continue;
        }
        finally
        {
          if (localObject9 == null) {
            break label1081;
          }
        }
        try
        {
          localInputStream2.close();
          localObject4 = localObject8;
        }
        catch (Exception localException2)
        {
          w.printErrStackTrace("MicroMsg.FriendPreference", localException2, "", new Object[0]);
          localObject5 = localObject8;
          continue;
        }
        if (localObject4 != null)
        {
          localObject8 = Bitmap.createScaledBitmap((Bitmap)localObject4, 48, 48, false);
          if (localObject8 != localObject4) {
            ((Bitmap)localObject4).recycle();
          }
          localObject4 = com.tencent.mm.sdk.platformtools.d.a((Bitmap)localObject8, true, 0.0F);
          this.nNH.setImageBitmap((Bitmap)localObject4);
        }
        at.AR();
        if (!c.isSDCardAvailable()) {
          this.nNH.setBackgroundDrawable(com.tencent.mm.br.a.b(this.ezR, R.k.aVS));
        }
        GMTrace.o(6777055739904L, 50493);
        return;
        try
        {
          Object localObject5;
          ((InputStream)localObject9).close();
          throw ((Throwable)localObject6);
        }
        catch (Exception localException6)
        {
          for (;;)
          {
            w.printErrStackTrace("MicroMsg.FriendPreference", localException6, "", new Object[0]);
          }
        }
        if (!TextUtils.isEmpty(this.nNN))
        {
          if ((this.iBi == null) || (!this.kEu))
          {
            w.d("MicroMsg.FriendPreference", "initView : contact = " + this.iBi + " bindView = " + this.kEu);
            GMTrace.o(6777055739904L, 50493);
            return;
          }
          this.ePs = 3;
          this.hqi.setText(this.mContext.getString(R.l.dQJ));
          this.nNG.setText(bg.nl(this.nNN));
          this.nNH.setVisibility(8);
          GMTrace.o(6777055739904L, 50493);
          return;
        }
        Assert.assertTrue(false);
        GMTrace.o(6777055739904L, 50493);
        return;
      }
    }
  }
  
  private void init()
  {
    GMTrace.i(6776653086720L, 50490);
    this.kEu = false;
    this.iBi = null;
    this.nNJ = null;
    this.nNK = "";
    this.nNL = 0L;
    this.nNM = 0L;
    this.ePs = 0;
    this.nNN = "";
    GMTrace.o(6776653086720L, 50490);
  }
  
  public final boolean ahL()
  {
    GMTrace.i(6777324175360L, 50495);
    n.Dh().e(this);
    GMTrace.o(6777324175360L, 50495);
    return true;
  }
  
  public final void ib(String paramString)
  {
    GMTrace.i(6777458393088L, 50496);
    long l = com.tencent.mm.ac.b.hO(paramString);
    if ((l > 0L) && (this.nNL == l) && (com.tencent.mm.ac.b.a(paramString, false, -1) != null)) {
      MP();
    }
    if ((com.tencent.mm.ac.b.hN(paramString) == this.nNM) && (com.tencent.mm.ac.b.a(paramString, false, -1) != null)) {
      MP();
    }
    GMTrace.o(6777458393088L, 50496);
  }
  
  public final void onBindView(View paramView)
  {
    GMTrace.i(6776921522176L, 50492);
    this.hqi = ((TextView)paramView.findViewById(R.h.title));
    this.nNG = ((TextView)paramView.findViewById(R.h.summary));
    this.nNH = ((ImageView)paramView.findViewById(R.h.bGN));
    this.nNI = ((ImageView)paramView.findViewById(R.h.bNR));
    this.kEu = true;
    MP();
    super.onBindView(paramView);
    GMTrace.o(6776921522176L, 50492);
  }
  
  protected final View onCreateView(ViewGroup paramViewGroup)
  {
    GMTrace.i(6776787304448L, 50491);
    paramViewGroup = super.onCreateView(paramViewGroup);
    LayoutInflater localLayoutInflater = (LayoutInflater)this.mContext.getSystemService("layout_inflater");
    ViewGroup localViewGroup = (ViewGroup)paramViewGroup.findViewById(R.h.content);
    localViewGroup.removeAllViews();
    localLayoutInflater.inflate(R.i.cBG, localViewGroup);
    GMTrace.o(6776787304448L, 50491);
    return paramViewGroup;
  }
  
  public final boolean p(String paramString, Bitmap paramBitmap)
  {
    GMTrace.i(6777189957632L, 50494);
    if (paramBitmap != null)
    {
      ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
      paramBitmap.compress(Bitmap.CompressFormat.PNG, 100, localByteArrayOutputStream);
      boolean bool = com.tencent.mm.modelfriend.m.a(paramString, this.mContext, localByteArrayOutputStream.toByteArray());
      GMTrace.o(6777189957632L, 50494);
      return bool;
    }
    GMTrace.o(6777189957632L, 50494);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\profile\ui\FriendPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */