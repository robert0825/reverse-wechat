package com.tencent.mm.pluginsdk.ui.applet;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.TextPaint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.f;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.ao.a.a.c.a;
import com.tencent.mm.ao.n;
import com.tencent.mm.api.f;
import com.tencent.mm.api.g;
import com.tencent.mm.plugin.gif.MMAnimateView;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.ui.base.NoMeasuredTextView;
import com.tencent.mm.ui.base.PasterEditText;
import com.tencent.mm.ui.base.i;
import com.tencent.mm.ui.base.i.a;
import com.tencent.mm.ui.base.i.a.a;
import com.tencent.mm.ui.base.i.a.b;
import com.tencent.mm.ui.base.i.a.c;
import com.tencent.mm.ui.base.q;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.v;
import com.tencent.mm.y.s;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import junit.framework.Assert;

public final class e
  implements o
{
  public static View Q(Context paramContext, int paramInt)
  {
    GMTrace.i(956301312000L, 7125);
    paramContext = ((LayoutInflater)paramContext.getSystemService("layout_inflater")).inflate(paramInt, null);
    GMTrace.o(956301312000L, 7125);
    return paramContext;
  }
  
  public static i a(p paramp, int paramInt, String paramString, boolean paramBoolean, o.a parama)
  {
    GMTrace.i(17953500168192L, 133764);
    paramp = a(paramp, paramInt, paramString, paramBoolean, "", parama);
    GMTrace.o(17953500168192L, 133764);
    return paramp;
  }
  
  public static i a(p paramp, int paramInt, String paramString1, boolean paramBoolean, String paramString2, o.a parama)
  {
    GMTrace.i(17953634385920L, 133765);
    i.a locala = new i.a(paramp.vKW);
    Object localObject = paramp.vKW.getIntent().getExtras().getString("Select_Conv_User", null);
    if (localObject != null)
    {
      localObject = bg.g(((String)localObject).split(","));
      a(paramp.vKW, locala, localObject);
    }
    locala.ly(true);
    if (paramInt == R.k.cJb) {
      localObject = paramp.vKW.getResources().getString(R.l.cTf);
    }
    for (;;)
    {
      locala.P((String)localObject + paramString1).lz(false).lA(false);
      if (paramBoolean) {
        locala.VB(paramp.vKW.getString(R.l.dit));
      }
      paramString1 = locala.aax();
      a(paramp.vKW, paramString1, paramString2, null, parama, parama);
      paramString1.show();
      GMTrace.o(17953634385920L, 133765);
      return paramString1;
      if (paramInt == R.k.cJd) {
        localObject = paramp.vKW.getResources().getString(R.l.cTB);
      } else if (paramInt == R.k.cJo) {
        localObject = paramp.vKW.getResources().getString(R.l.cUP);
      } else {
        localObject = paramp.vKW.getResources().getString(R.l.cRN);
      }
    }
  }
  
  public static i a(p paramp, String paramString1, View paramView, String paramString2, o.b paramb)
  {
    GMTrace.i(17954439692288L, 133771);
    if ((paramString1 == null) || (paramString1.length() == 0))
    {
      w.e("MicroMsg.MMConfirmDialog", "showDialogItem1 fail, title message both are empty");
      GMTrace.o(17954439692288L, 133771);
      return null;
    }
    i.a locala = new i.a(paramp.vKW);
    locala.lz(false);
    locala.lA(false);
    a(locala, paramp.vKW, paramString1);
    if (!bg.nm(paramString2))
    {
      paramString1 = paramString2;
      if (paramString2.length() != 0) {}
    }
    else
    {
      paramString1 = paramp.vKW.getResources().getString(R.l.diw);
    }
    locala.VC(paramString1).a(new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(942074232832L, 7019);
        if (this.twK != null) {
          this.twK.fx(true);
        }
        GMTrace.o(942074232832L, 7019);
      }
    });
    locala.BR(R.l.cSk).b(new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(966367641600L, 7200);
        if (this.twK != null) {
          this.twK.fx(false);
        }
        GMTrace.o(966367641600L, 7200);
      }
    });
    locala.dg(paramView);
    paramString1 = locala.aax();
    paramString1.BL(paramp.vKW.getResources().getColor(R.e.aPp));
    paramString1.show();
    GMTrace.o(17954439692288L, 133771);
    return paramString1;
  }
  
  public static i a(p paramp, String paramString1, String paramString2, String paramString3, o.a parama1, o.a parama2)
  {
    GMTrace.i(17954037039104L, 133768);
    i.a locala = new i.a(paramp.vKW);
    locala.a(com.tencent.mm.compatible.f.a.decodeResource(paramp.vKW.getResources(), R.k.cLX), false, 3);
    locala.lz(false);
    locala.lA(false);
    locala.bZC();
    locala.waR.vYh = paramString1;
    locala.BP(17);
    paramString1 = locala.aax();
    a(paramp.vKW, paramString1, paramString3, paramString2, parama2, parama1);
    paramString1.BM(paramp.vKW.getResources().getColor(R.e.aNQ));
    paramString1.show();
    GMTrace.o(17954037039104L, 133768);
    return paramString1;
  }
  
  public static i a(p paramp, String paramString1, String paramString2, String paramString3, String paramString4, boolean paramBoolean, String paramString5, o.a parama)
  {
    GMTrace.i(17952023773184L, 133753);
    if (((paramString1 == null) || (paramString1.length() == 0)) && ((paramString3 == null) || (paramString3.length() == 0)))
    {
      w.e("MicroMsg.MMConfirmDialog", "showDialogItem1 fail, title message both are empty");
      GMTrace.o(17952023773184L, 133753);
      return null;
    }
    paramString4 = View.inflate(paramp.vKW, R.i.ctA, null);
    i.a locala = new i.a(paramp.vKW);
    locala.lz(false);
    locala.lA(false);
    a(locala, paramp.vKW, paramString1);
    m(paramString4, paramBoolean);
    a(paramp, locala, parama, paramString4, paramString5);
    paramString1 = (TextView)paramString4.findViewById(R.h.bpZ);
    paramString1.setText(com.tencent.mm.pluginsdk.ui.d.h.b(paramp.vKW, paramString3, paramString1.getTextSize()));
    paramString4.findViewById(R.h.bpW).setVisibility(8);
    int i = BackwardSupportUtil.b.a(paramp.vKW, 120.0F);
    paramp = (CdnImageView)paramString4.findViewById(R.h.bqb);
    if (paramp != null) {
      paramp.R(paramString2, i, i);
    }
    locala.dg(paramString4);
    paramp = locala.aax();
    paramp.show();
    GMTrace.o(17952023773184L, 133753);
    return paramp;
  }
  
  public static i a(p paramp, String paramString1, String paramString2, boolean paramBoolean, String paramString3, o.a parama)
  {
    GMTrace.i(17952157990912L, 133754);
    paramp = a(paramp, paramString1, paramString2, paramBoolean, paramString3, parama, paramp.vKW.getResources().getString(R.l.cUM));
    GMTrace.o(17952157990912L, 133754);
    return paramp;
  }
  
  public static i a(p paramp, String paramString1, String paramString2, boolean paramBoolean, String paramString3, o.a parama, String paramString4)
  {
    GMTrace.i(17952292208640L, 133755);
    if (((paramString1 == null) || (paramString1.length() == 0)) && ((paramString2 == null) || (paramString2.length() == 0)))
    {
      w.e("MicroMsg.MMConfirmDialog", "showDialogItem1 fail, title message both are empty");
      GMTrace.o(17952292208640L, 133755);
      return null;
    }
    paramString2 = new i.a(paramp.vKW);
    Object localObject = paramp.vKW.getIntent().getExtras().getString("Select_Conv_User", null);
    if (localObject != null)
    {
      localObject = bg.g(((String)localObject).split(","));
      a(paramp.vKW, paramString2, localObject);
    }
    paramString2.ly(true);
    paramString2.P(paramString4 + paramString1).lz(false).lA(false);
    if (paramBoolean) {
      paramString2.VB(paramp.vKW.getString(R.l.dit));
    }
    paramString1 = paramString2.aax();
    a(paramp.vKW, paramString1, paramString3, null, parama, parama);
    paramString1.show();
    GMTrace.o(17952292208640L, 133755);
    return paramString1;
  }
  
  public static i a(p paramp, String paramString, boolean paramBoolean, int paramInt, o.a parama)
  {
    GMTrace.i(17953768603648L, 133766);
    paramp = a(paramp, paramString, paramBoolean, paramInt, "", parama);
    GMTrace.o(17953768603648L, 133766);
    return paramp;
  }
  
  public static i a(p paramp, String paramString1, boolean paramBoolean, int paramInt, String paramString2, o.a parama)
  {
    GMTrace.i(17953902821376L, 133767);
    i.a locala = new i.a(paramp.vKW);
    Object localObject = paramp.vKW.getIntent().getExtras().getString("Select_Conv_User", null);
    if (localObject != null) {}
    for (localObject = bg.g(((String)localObject).split(","));; localObject = null)
    {
      a(paramp.vKW, locala, localObject);
      locala.ly(true);
      switch (paramInt)
      {
      default: 
        localObject = paramp.vKW.getResources().getString(R.l.cRN);
      }
      for (;;)
      {
        locala.P((String)localObject + paramString1).lz(false).lA(false);
        if (paramBoolean) {
          locala.VB(paramp.vKW.getString(R.l.dit));
        }
        paramString1 = locala.aax();
        a(paramp.vKW, paramString1, paramString2, null, parama, parama);
        paramString1.show();
        GMTrace.o(17953902821376L, 133767);
        return paramString1;
        localObject = paramp.vKW.getResources().getString(R.l.cUP);
        continue;
        localObject = paramp.vKW.getResources().getString(R.l.cTB);
      }
    }
  }
  
  public static i a(p paramp, String paramString, boolean paramBoolean, o.a parama)
  {
    GMTrace.i(17952560644096L, 133757);
    paramp = a(paramp, paramString, paramBoolean, "", parama);
    GMTrace.o(17952560644096L, 133757);
    return paramp;
  }
  
  public static i a(p paramp, String paramString1, boolean paramBoolean, String paramString2, o.a parama)
  {
    GMTrace.i(17952694861824L, 133758);
    if ((paramString1 == null) || (paramString1.length() == 0))
    {
      w.e("MicroMsg.MMConfirmDialog", "showDialogItem2 fail, message is empty");
      GMTrace.o(17952694861824L, 133758);
      return null;
    }
    i.a locala = new i.a(paramp.vKW);
    Object localObject = paramp.vKW.getIntent().getExtras().getString("Select_Conv_User", null);
    if (localObject != null)
    {
      localObject = bg.g(((String)localObject).split(","));
      a(paramp.vKW, locala, localObject);
    }
    locala.ly(true);
    locala.P(paramString1).lz(false).lA(false);
    if (paramBoolean) {
      locala.VB(paramp.vKW.getString(R.l.dit));
    }
    paramString1 = locala.aax();
    a(paramp.vKW, paramString1, paramString2, null, parama, parama);
    paramString1.show();
    GMTrace.o(17952694861824L, 133758);
    return paramString1;
  }
  
  public static i a(p paramp, byte[] paramArrayOfByte, boolean paramBoolean, o.a parama)
  {
    GMTrace.i(17953097515008L, 133761);
    paramp = a(paramp, paramArrayOfByte, paramBoolean, "", parama);
    GMTrace.o(17953097515008L, 133761);
    return paramp;
  }
  
  public static i a(p paramp, byte[] paramArrayOfByte, boolean paramBoolean, String paramString, o.a parama)
  {
    GMTrace.i(17953231732736L, 133762);
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length == 0))
    {
      w.e("MicroMsg.MMConfirmDialog", "showDialogItem3 fail, imgData is null");
      GMTrace.o(17953231732736L, 133762);
      return null;
    }
    i.a locala = new i.a(paramp.vKW);
    Object localObject = paramp.vKW.getIntent().getExtras().getString("Select_Conv_User", null);
    if (localObject != null)
    {
      localObject = bg.g(((String)localObject).split(","));
      a(paramp.vKW, locala, localObject);
    }
    locala.ly(true);
    locala.lz(false).lA(false);
    if (paramBoolean) {
      locala.VB(paramp.vKW.getString(R.l.dit));
    }
    if ((paramArrayOfByte != null) && (paramArrayOfByte.length > 0))
    {
      paramArrayOfByte = BitmapFactory.decodeByteArray(paramArrayOfByte, 0, paramArrayOfByte.length);
      if (paramArrayOfByte != null)
      {
        locala.a(paramArrayOfByte, true, 3);
        a(locala, paramArrayOfByte);
        locala.ly(false);
      }
    }
    paramArrayOfByte = locala.aax();
    a(paramp.vKW, paramArrayOfByte, paramString, null, parama, parama);
    paramArrayOfByte.show();
    GMTrace.o(17953231732736L, 133762);
    return paramArrayOfByte;
  }
  
  public static q a(p paramp, long paramLong, String paramString1, String paramString2, String paramString3, o.a parama)
  {
    GMTrace.i(17954305474560L, 133770);
    final View localView = Q(paramp.vKW, R.i.ctE);
    final q localq = cR(localView);
    a(localView, parama, localq);
    if (bg.nm(paramString1))
    {
      w.e("MicroMsg.MMConfirmDialog", "showDialogItem8 fail,title or  message is empty");
      GMTrace.o(17954305474560L, 133770);
      return null;
    }
    a(localView, R.h.bqc, paramString1, false, 0);
    NoMeasuredTextView localNoMeasuredTextView = (NoMeasuredTextView)localView.findViewById(R.h.bpZ);
    localNoMeasuredTextView.whw = true;
    localNoMeasuredTextView.J(paramp.vKW.getResources().getDimension(R.f.aPz) * com.tencent.mm.br.a.dZ(paramp.vKW));
    localNoMeasuredTextView.setTextColor(com.tencent.mm.br.a.U(paramp.vKW, R.e.aOE));
    Object localObject = ((f)com.tencent.mm.kernel.h.h(f.class)).t(paramLong);
    String str1;
    if ((localObject != null) && (((com.tencent.mm.af.a.c)localObject).FU()))
    {
      paramString1 = ((com.tencent.mm.af.a.c)localObject).field_chatName;
      str1 = ((com.tencent.mm.af.a.c)localObject).field_headImageUrl;
      localObject = ((com.tencent.mm.af.a.c)localObject).field_brandUserName;
      String str2 = paramString1;
      if (paramString1 == null) {
        str2 = paramString2;
      }
      if (bg.nm(str2)) {
        break label433;
      }
      localNoMeasuredTextView.setText(com.tencent.mm.pluginsdk.ui.d.h.b(paramp.vKW, str2, localNoMeasuredTextView.fB.getTextSize()));
    }
    for (;;)
    {
      a(localView, R.h.bpX, null, true, 8);
      paramString1 = (Button)localView.findViewById(R.h.bpS);
      if (!bg.nm(paramString3)) {
        paramString1.setText(paramString3);
      }
      paramString1.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(945698111488L, 7046);
          if (this.twL != null) {
            this.twL.a(true, e.cS(localView), e.cT(localView));
          }
          localq.dismiss();
          localq.setFocusable(false);
          localq.setTouchable(false);
          GMTrace.o(945698111488L, 7046);
        }
      });
      paramString1 = new c.a();
      paramString1.gKF = com.tencent.mm.api.a.bk((String)localObject);
      paramString1.gKC = true;
      paramString1.gKY = true;
      paramString1.gKR = R.k.aVS;
      paramString1 = paramString1.Jn();
      if (!bg.nm(str1)) {
        n.Jd().a(str1, (ImageView)localView.findViewById(R.h.bqb), paramString1);
      }
      a(paramp, localq);
      GMTrace.o(17954305474560L, 133770);
      return localq;
      localObject = ((g)com.tencent.mm.kernel.h.h(g.class)).bl(((com.tencent.mm.af.a.c)localObject).field_bizChatServId);
      if (localObject != null)
      {
        paramString1 = ((com.tencent.mm.af.a.j)localObject).field_userName;
        str1 = ((com.tencent.mm.af.a.j)localObject).field_headImageUrl;
        localObject = ((com.tencent.mm.af.a.j)localObject).field_brandUserName;
        break;
      }
      w.w("MicroMsg.MMConfirmDialog", "showDialogItem8 userInfo is null");
      GMTrace.o(17954305474560L, 133770);
      return null;
      label433:
      localNoMeasuredTextView.setText(com.tencent.mm.pluginsdk.ui.d.h.b(paramp.vKW, paramString2, localNoMeasuredTextView.fB.getTextSize()));
    }
  }
  
  public static q a(p paramp, final Bitmap paramBitmap, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, o.a parama)
  {
    GMTrace.i(20405926494208L, 152036);
    paramBitmap = Q(paramp.vKW, R.i.ctE);
    final q localq = cR(paramBitmap);
    a(paramBitmap, parama, localq);
    if (bg.nm(paramString2))
    {
      w.e("MicroMsg.MMConfirmDialog", "showDialogItem8 fail,title or  message is empty");
      GMTrace.o(20405926494208L, 152036);
      return null;
    }
    a(paramBitmap, R.h.bqc, paramString2, false, 0);
    paramString2 = (NoMeasuredTextView)paramBitmap.findViewById(R.h.bpZ);
    paramString2.whw = true;
    paramString2.J(paramp.vKW.getResources().getDimension(R.f.aPz) * com.tencent.mm.br.a.dZ(paramp.vKW));
    paramString2.setTextColor(com.tencent.mm.br.a.U(paramp.vKW, R.e.aOE));
    if (!bg.nm(paramString1)) {
      paramString2.setText(((com.tencent.mm.plugin.emoji.b.a)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.emoji.b.a.class)).b(paramp.vKW, ((com.tencent.mm.plugin.messenger.a.a)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.a.a.class)).fs(paramString1), paramString2.fB.getTextSize()));
    }
    for (;;)
    {
      a(paramBitmap, R.h.bpX, paramString4, true, 8);
      paramString2 = (Button)paramBitmap.findViewById(R.h.bpS);
      if (!bg.nm(paramString5)) {
        paramString2.setText(paramString5);
      }
      paramString2.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(961804238848L, 7166);
          if (this.twL != null) {
            this.twL.a(true, e.cS(paramBitmap), e.cT(paramBitmap));
          }
          localq.dismiss();
          localq.setFocusable(false);
          localq.setTouchable(false);
          GMTrace.o(961804238848L, 7166);
        }
      });
      if (!bg.nm(paramString1)) {
        a.b.a((ImageView)paramBitmap.findViewById(R.h.bqb), paramString1);
      }
      a(paramp, localq);
      GMTrace.o(20405926494208L, 152036);
      return localq;
      paramString2.setText(((com.tencent.mm.plugin.emoji.b.a)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.emoji.b.a.class)).b(paramp.vKW, paramString3, paramString2.fB.getTextSize()));
    }
  }
  
  public static void a(Context paramContext, i.a parama, final Object paramObject)
  {
    GMTrace.i(953482739712L, 7104);
    if (paramObject != null) {
      if ((paramObject instanceof String)) {
        paramObject = bg.g(((String)paramObject).split(","));
      }
    }
    for (;;)
    {
      if (bg.cc((List)paramObject))
      {
        GMTrace.o(953482739712L, 7104);
        return;
        if ((paramObject instanceof List)) {
          paramObject = (List)paramObject;
        }
      }
      else
      {
        if (((List)paramObject).size() == 1)
        {
          paramObject = (String)((List)paramObject).get(0);
          int i = com.tencent.mm.br.a.fromDPToPix(paramContext, (int)(20.0F * com.tencent.mm.br.a.dZ(paramContext)));
          Object localObject1 = paramContext.getString(R.l.dSk);
          parama.O(((com.tencent.mm.plugin.emoji.b.a)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.emoji.b.a.class)).a(paramContext, ((String)localObject1).toString(), i));
          localObject1 = ((com.tencent.mm.plugin.messenger.a.a)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.a.a.class)).fs((String)paramObject);
          i = com.tencent.mm.br.a.fromDPToPix(paramContext, (int)(14.0F * com.tencent.mm.br.a.dZ(paramContext)));
          if (s.eb((String)paramObject))
          {
            Object localObject2 = paramContext.getString(R.l.dWL, new Object[] { Integer.valueOf(((com.tencent.mm.plugin.chatroom.b.a)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.chatroom.b.a.class)).fk((String)paramObject)) });
            localObject1 = (String)localObject1 + (String)localObject2;
            localObject1 = ((com.tencent.mm.plugin.emoji.b.a)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.emoji.b.a.class)).a(paramContext, ((String)localObject1).toString(), i);
            localObject2 = v.fb(paramContext).inflate(R.i.cus, null);
            GridView localGridView = (GridView)((View)localObject2).findViewById(R.h.bmd);
            final ArrayList localArrayList = new ArrayList();
            final List localList = ((com.tencent.mm.plugin.chatroom.b.a)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.chatroom.b.a.class)).fi((String)paramObject);
            parama.a((String)paramObject, (CharSequence)localObject1, Boolean.valueOf(true), new i.a.b()
            {
              public final void bLD()
              {
                GMTrace.i(957911924736L, 7137);
                bg.da(this.twI);
                if ((localArrayList.size() == 0) && (!bg.nm(paramObject)))
                {
                  ArrayList localArrayList = localArrayList;
                  Object localObject = localList;
                  if (!bg.cc((List)localObject))
                  {
                    localObject = ((List)localObject).iterator();
                    while (((Iterator)localObject).hasNext())
                    {
                      String str = (String)((Iterator)localObject).next();
                      localArrayList.add(((com.tencent.mm.plugin.messenger.a.a)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.a.a.class)).fs(str));
                    }
                  }
                }
                GMTrace.o(957911924736L, 7137);
              }
            });
            localGridView.setAdapter(new j(paramContext, localList, localArrayList));
            localGridView.setSelector(new ColorDrawable(paramContext.getResources().getColor(R.e.transparent)));
            if (localList != null)
            {
              if (localList.size() <= 16) {
                break label448;
              }
              localGridView.setLayoutParams(new LinearLayout.LayoutParams(-1, com.tencent.mm.br.a.V(paramContext, R.f.aPR)));
              localGridView.setPadding(com.tencent.mm.br.a.V(paramContext, R.f.aPQ), 0, com.tencent.mm.br.a.V(paramContext, R.f.aPQ), 0);
            }
            for (;;)
            {
              parama.waR.vYG = ((View)localObject2);
              GMTrace.o(953482739712L, 7104);
              return;
              label448:
              localGridView.setPadding(0, 0, 0, com.tencent.mm.br.a.V(paramContext, R.f.aPP));
            }
          }
          parama.a((String)paramObject, ((com.tencent.mm.plugin.emoji.b.a)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.emoji.b.a.class)).a(paramContext, ((String)localObject1).toString(), i), Boolean.valueOf(false), null);
          GMTrace.o(953482739712L, 7104);
          return;
        }
        parama.waR.vYm = ((List)paramObject);
        parama.Vz(paramContext.getString(R.l.dJt));
        GMTrace.o(953482739712L, 7104);
        return;
      }
      paramObject = null;
    }
  }
  
  public static void a(Context paramContext, i parami, String paramString1, String paramString2, final o.a parama1, final o.a parama2)
  {
    GMTrace.i(17951889555456L, 133752);
    String str;
    if (!bg.nm(paramString1))
    {
      str = paramString1;
      if (paramString1.length() != 0) {}
    }
    else
    {
      str = paramContext.getResources().getString(R.l.diw);
    }
    if (!bg.nm(paramString2))
    {
      paramString1 = paramString2;
      if (paramString2.length() != 0) {}
    }
    else
    {
      paramString1 = paramContext.getResources().getString(R.l.cSk);
    }
    parami.a(str, true, new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(941805797376L, 7017);
        this.twN.dismiss();
        if (parama1 != null) {
          parama1.a(true, this.twN.bZA(), this.twN.bZB());
        }
        GMTrace.o(941805797376L, 7017);
      }
    });
    parami.b(paramString1, true, new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(947040288768L, 7056);
        this.twN.dismiss();
        if (parama2 != null) {
          parama2.a(false, null, 0);
        }
        GMTrace.o(947040288768L, 7056);
      }
    });
    GMTrace.o(17951889555456L, 133752);
  }
  
  private static void a(View paramView, int paramInt1, String paramString, boolean paramBoolean, int paramInt2)
  {
    GMTrace.i(957106618368L, 7131);
    paramView = (TextView)paramView.findViewById(paramInt1);
    if (paramView != null) {}
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue(bool);
      if ((!paramBoolean) || (!bg.nm(paramString))) {
        break;
      }
      paramView.setVisibility(paramInt2);
      GMTrace.o(957106618368L, 7131);
      return;
    }
    paramView.setText(paramString);
    GMTrace.o(957106618368L, 7131);
  }
  
  static void a(final View paramView, o.a parama, final q paramq)
  {
    GMTrace.i(17954708127744L, 133773);
    ((Button)paramView.findViewById(R.h.bpS)).setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(967307165696L, 7207);
        if (this.twL != null) {
          this.twL.a(true, e.cS(paramView), e.cT(paramView));
        }
        paramq.dismiss();
        paramq.setFocusable(false);
        paramq.setTouchable(false);
        GMTrace.o(967307165696L, 7207);
      }
    });
    paramView = (Button)paramView.findViewById(R.h.bpT);
    if (paramView != null) {
      paramView.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(947711377408L, 7061);
          if (this.twL != null) {
            this.twL.a(false, null, 0);
          }
          paramq.dismiss();
          paramq.setFocusable(false);
          paramq.setTouchable(false);
          GMTrace.o(947711377408L, 7061);
        }
      });
    }
    GMTrace.o(17954708127744L, 133773);
  }
  
  private static void a(i.a parama, Context paramContext, String paramString)
  {
    GMTrace.i(956703965184L, 7128);
    parama.Vz(paramString);
    int i = paramContext.getResources().getColor(R.e.aOE);
    parama.waR.trL = i;
    parama.waR.vYH = 2;
    GMTrace.o(956703965184L, 7128);
  }
  
  public static void a(i.a parama, Bitmap paramBitmap)
  {
    GMTrace.i(957375053824L, 7133);
    parama.a(new DialogInterface.OnDismissListener()
    {
      public final void onDismiss(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(942611103744L, 7023);
        if ((this.val$bmp == null) || (this.val$bmp.isRecycled()))
        {
          GMTrace.o(942611103744L, 7023);
          return;
        }
        GMTrace.o(942611103744L, 7023);
      }
    });
    GMTrace.o(957375053824L, 7133);
  }
  
  public static void a(p paramp, i.a parama, o.a parama1, final View paramView, String paramString)
  {
    GMTrace.i(17954573910016L, 133772);
    String str;
    if (!bg.nm(paramString))
    {
      str = paramString;
      if (paramString.length() != 0) {}
    }
    else
    {
      str = paramp.vKW.getResources().getString(R.l.diw);
    }
    parama.VC(str).a(new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(958448795648L, 7141);
        if (this.twL != null) {
          this.twL.a(true, e.cS(paramView), e.cT(paramView));
        }
        GMTrace.o(958448795648L, 7141);
      }
    });
    parama.BR(R.l.cSk).b(new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(965830770688L, 7196);
        if (this.twL != null) {
          this.twL.a(false, null, 0);
        }
        GMTrace.o(965830770688L, 7196);
      }
    });
    GMTrace.o(17954573910016L, 133772);
  }
  
  static void a(p paramp, q paramq)
  {
    GMTrace.i(957240836096L, 7132);
    try
    {
      if (!paramp.vKW.isFinishing())
      {
        paramq.setInputMethodMode(1);
        paramq.setSoftInputMode(16);
        paramq.setFocusable(true);
        paramq.setTouchable(true);
        paramq.showAtLocation(paramp.vKW.getWindow().getDecorView(), 17, 0, 0);
      }
      GMTrace.o(957240836096L, 7132);
      return;
    }
    catch (Exception paramp)
    {
      w.e("MicroMsg.MMConfirmDialog", "show dialog fail: %s", new Object[] { paramp.getMessage() });
      w.printErrStackTrace("MicroMsg.MMConfirmDialog", paramp, "", new Object[0]);
      GMTrace.o(957240836096L, 7132);
    }
  }
  
  public static i b(p paramp, String paramString1, String paramString2, String paramString3, o.a parama)
  {
    GMTrace.i(17953365950464L, 133763);
    if ((paramString1 == null) || (paramString1.length() == 0))
    {
      w.e("MicroMsg.MMConfirmDialog", "showDialogItem4 fail, title message both are empty");
      GMTrace.o(17953365950464L, 133763);
      return null;
    }
    View localView = Q(paramp.vKW, R.i.ctB);
    i.a locala = new i.a(paramp.vKW);
    locala.lz(false);
    locala.lA(false);
    if (localView != null)
    {
      EditText localEditText = (EditText)localView.findViewById(R.h.bqa);
      if (localEditText != null)
      {
        localEditText.setVisibility(0);
        localEditText.setHint(bg.nl(paramString2));
      }
    }
    a(paramp, locala, parama, localView, paramString3);
    if (!bg.nm(null)) {
      a(locala, paramp.vKW, null);
    }
    ((TextView)localView.findViewById(R.h.bqc)).setVisibility(8);
    paramString2 = (TextView)localView.findViewById(R.h.bpZ);
    paramString2.setText(com.tencent.mm.pluginsdk.ui.d.h.b(paramp.vKW, paramString1, paramString2.getTextSize()));
    ((TextView)localView.findViewById(R.h.bpW)).setVisibility(8);
    int i = BackwardSupportUtil.b.a(paramp.vKW, 120.0F);
    paramp = (CdnImageView)localView.findViewById(R.h.bqb);
    if (paramp != null)
    {
      if (bg.nm(null)) {
        break label273;
      }
      a.b.a(paramp, null);
    }
    for (;;)
    {
      locala.dg(localView);
      paramp = locala.aax();
      paramp.show();
      GMTrace.o(17953365950464L, 133763);
      return paramp;
      label273:
      if (!bg.nm(null)) {
        paramp.R(null, i, i);
      } else {
        paramp.setVisibility(8);
      }
    }
  }
  
  public static i b(p paramp, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, o.a parama)
  {
    GMTrace.i(17952426426368L, 133756);
    if (((paramString1 == null) || (paramString1.length() == 0)) && ((paramString3 == null) || (paramString3.length() == 0)))
    {
      w.e("MicroMsg.MMConfirmDialog", "showDialogItem1 fail, title message both are empty");
      GMTrace.o(17952426426368L, 133756);
      return null;
    }
    View localView = View.inflate(paramp.vKW, R.i.ctA, null);
    i.a locala = new i.a(paramp.vKW);
    locala.lz(false);
    locala.lA(false);
    a(locala, paramp.vKW, paramString1);
    if (localView != null)
    {
      paramString1 = (EditText)localView.findViewById(R.h.bqa);
      if (paramString1 != null) {
        paramString1.setVisibility(0);
      }
      paramString1.setText(paramString4);
    }
    a(paramp, locala, parama, localView, paramString5);
    paramString1 = (TextView)localView.findViewById(R.h.bpZ);
    paramString1.setText(com.tencent.mm.pluginsdk.ui.d.h.b(paramp.vKW, paramString3, paramString1.getTextSize()));
    localView.findViewById(R.h.bpW).setVisibility(8);
    int i = BackwardSupportUtil.b.a(paramp.vKW, 120.0F);
    paramp = (CdnImageView)localView.findViewById(R.h.bqb);
    if (paramp != null) {
      paramp.R(paramString2, i, i);
    }
    locala.dg(localView);
    paramp = locala.aax();
    paramp.show();
    GMTrace.o(17952426426368L, 133756);
    return paramp;
  }
  
  public static i b(p paramp, String paramString, boolean paramBoolean, o.a parama)
  {
    GMTrace.i(17952829079552L, 133759);
    paramp = b(paramp, paramString, paramBoolean, "", parama);
    GMTrace.o(17952829079552L, 133759);
    return paramp;
  }
  
  public static i b(p paramp, String paramString1, boolean paramBoolean, String paramString2, o.a parama)
  {
    GMTrace.i(17952963297280L, 133760);
    if ((paramString1 == null) || (!com.tencent.mm.a.e.aZ(paramString1)))
    {
      w.e("MicroMsg.MMConfirmDialog", "showDialogItem3 fail, img does not exist");
      GMTrace.o(17952963297280L, 133760);
      return null;
    }
    i.a locala = new i.a(paramp.vKW);
    Object localObject = paramp.vKW.getIntent().getExtras().getString("Select_Conv_User", null);
    if (localObject != null)
    {
      localObject = bg.g(((String)localObject).split(","));
      a(paramp.vKW, locala, localObject);
    }
    locala.ly(true);
    locala.lz(false).lA(false);
    if (paramBoolean) {
      locala.VB(paramp.vKW.getString(R.l.dit));
    }
    if (!bg.nm(paramString1))
    {
      paramString1 = com.tencent.mm.sdk.platformtools.d.RD(paramString1);
      if (paramString1 != null)
      {
        locala.a(paramString1, true, 3);
        a(locala, paramString1);
        locala.ly(false);
      }
    }
    paramString1 = locala.aax();
    a(paramp.vKW, paramString1, paramString2, null, parama, parama);
    paramString1.show();
    GMTrace.o(17952963297280L, 133760);
    return paramString1;
  }
  
  static q cR(View paramView)
  {
    GMTrace.i(956435529728L, 7126);
    paramView = new q(paramView, -1, -1);
    GMTrace.o(956435529728L, 7126);
    return paramView;
  }
  
  public static String cS(View paramView)
  {
    GMTrace.i(16011772297216L, 119297);
    paramView = (EditText)paramView.findViewById(R.h.bqa);
    if (paramView == null)
    {
      GMTrace.o(16011772297216L, 119297);
      return null;
    }
    paramView = paramView.getText().toString();
    GMTrace.o(16011772297216L, 119297);
    return paramView;
  }
  
  public static int cT(View paramView)
  {
    GMTrace.i(16011906514944L, 119298);
    paramView = (EditText)paramView.findViewById(R.h.bqa);
    if ((paramView instanceof PasterEditText))
    {
      int i = ((PasterEditText)paramView).boQ();
      GMTrace.o(16011906514944L, 119298);
      return i;
    }
    GMTrace.o(16011906514944L, 119298);
    return 0;
  }
  
  public static void m(View paramView, boolean paramBoolean)
  {
    GMTrace.i(956972400640L, 7130);
    if (paramView != null)
    {
      paramView = (EditText)paramView.findViewById(R.h.bqa);
      if (paramView != null) {
        if (!paramBoolean) {
          break label49;
        }
      }
    }
    label49:
    for (int i = 0;; i = 8)
    {
      paramView.setVisibility(i);
      GMTrace.o(956972400640L, 7130);
      return;
    }
  }
  
  public static final class a
  {
    public DialogInterface.OnDismissListener iKD;
    public Context mContext;
    public i oaD;
    public final i.a twQ;
    String twR;
    
    public a(Context paramContext)
    {
      GMTrace.i(963414851584L, 7178);
      this.twR = null;
      this.mContext = paramContext;
      this.twQ = new i.a(this.mContext);
      this.twQ.lz(false);
      this.twQ.lA(false);
      this.twQ.a(new i.a.c()
      {
        public final CharSequence a(CharSequence paramAnonymousCharSequence, float paramAnonymousFloat)
        {
          GMTrace.i(967038730240L, 7205);
          paramAnonymousCharSequence = ((com.tencent.mm.plugin.emoji.b.a)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.emoji.b.a.class)).a(e.a.this.mContext, paramAnonymousCharSequence, paramAnonymousFloat);
          GMTrace.o(967038730240L, 7205);
          return paramAnonymousCharSequence;
        }
      });
      GMTrace.o(963414851584L, 7178);
    }
    
    public final a Pi(String paramString)
    {
      GMTrace.i(963817504768L, 7181);
      int i = com.tencent.mm.br.a.fromDPToPix(this.mContext, (int)(14.0F * com.tencent.mm.br.a.dZ(this.mContext)));
      if (!bg.nm(paramString))
      {
        paramString = ((com.tencent.mm.plugin.emoji.b.a)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.emoji.b.a.class)).a(this.mContext, paramString.toString(), i);
        this.twQ.P(paramString);
      }
      GMTrace.o(963817504768L, 7181);
      return this;
    }
    
    public final a Pj(String paramString)
    {
      GMTrace.i(963951722496L, 7182);
      this.twQ.waR.eIy = paramString;
      GMTrace.o(963951722496L, 7182);
      return this;
    }
    
    public final a Pk(String paramString)
    {
      GMTrace.i(964354375680L, 7185);
      Object localObject = this.mContext;
      i.a locala = this.twQ;
      localObject = v.fb((Context)localObject).inflate(R.i.cBu, null);
      MMAnimateView localMMAnimateView = (MMAnimateView)((View)localObject).findViewById(R.h.buq);
      if (localMMAnimateView == null) {
        w.e("MicroMsg.MMConfirmDialog", "Error , emoji imageView is null !!");
      }
      for (;;)
      {
        this.twQ.ly(false);
        GMTrace.o(964354375680L, 7185);
        return this;
        if (!bg.nm(paramString)) {
          break;
        }
        w.e("MicroMsg.MMConfirmDialog", "Error , emoji msg path is null !!");
      }
      EmojiInfo localEmojiInfo = ((com.tencent.mm.plugin.emoji.b.c)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.emoji.b.c.class)).getEmojiMgr().vP(paramString);
      if (paramString.indexOf(File.separatorChar) != -1)
      {
        label124:
        if ((localEmojiInfo == null) || ((localEmojiInfo.field_reserved4 & EmojiInfo.vCJ) != EmojiInfo.vCJ)) {
          break label219;
        }
        localMMAnimateView.h(((com.tencent.mm.plugin.emoji.b.c)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.emoji.b.c.class)).getEmojiMgr().a(localEmojiInfo), "");
      }
      for (;;)
      {
        locala.dg((View)localObject);
        locala.BP(1);
        break;
        com.tencent.mm.pluginsdk.c.d locald = ((com.tencent.mm.plugin.emoji.b.c)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.emoji.b.c.class)).getEmojiMgr();
        com.tencent.mm.plugin.emoji.d.apR();
        paramString = locald.bU("", paramString);
        break label124;
        label219:
        localMMAnimateView.zZ(paramString);
      }
    }
    
    public final a Pl(String paramString)
    {
      GMTrace.i(964757028864L, 7188);
      this.twQ.VB(paramString);
      GMTrace.o(964757028864L, 7188);
      return this;
    }
    
    public final a a(Bitmap paramBitmap, int paramInt)
    {
      GMTrace.i(964220157952L, 7184);
      this.twQ.a(paramBitmap, true, paramInt);
      this.twQ.ly(false);
      this.twQ.a(new e.8(paramBitmap));
      GMTrace.o(964220157952L, 7184);
      return this;
    }
    
    public final a a(o.a parama)
    {
      GMTrace.i(17951486902272L, 133749);
      this.oaD = this.twQ.aax();
      if (this.iKD != null) {
        this.oaD.setOnDismissListener(this.iKD);
      }
      e.a(this.mContext, this.oaD, this.twR, null, parama, parama);
      GMTrace.o(17951486902272L, 133749);
      return this;
    }
    
    public final a a(i.a.a parama)
    {
      GMTrace.i(964488593408L, 7186);
      this.twQ.waR.vYr = parama;
      GMTrace.o(964488593408L, 7186);
      return this;
    }
    
    public final a bA(Object paramObject)
    {
      GMTrace.i(963549069312L, 7179);
      e.a(this.mContext, this.twQ, paramObject);
      this.twQ.ly(true);
      GMTrace.o(963549069312L, 7179);
      return this;
    }
    
    public final a bLE()
    {
      GMTrace.i(963683287040L, 7180);
      this.twQ.waR.vYI = 2;
      GMTrace.o(963683287040L, 7180);
      return this;
    }
    
    public final a bLF()
    {
      GMTrace.i(964085940224L, 7183);
      this.twQ.waR.vYL = 8;
      GMTrace.o(964085940224L, 7183);
      return this;
    }
    
    public final a bLG()
    {
      GMTrace.i(17951352684544L, 133748);
      this.twQ.ly(false);
      GMTrace.o(17951352684544L, 133748);
      return this;
    }
    
    public final a cU(View paramView)
    {
      GMTrace.i(17951218466816L, 133747);
      this.twQ.dg(paramView);
      GMTrace.o(17951218466816L, 133747);
      return this;
    }
    
    public final a e(Boolean paramBoolean)
    {
      GMTrace.i(964622811136L, 7187);
      i.a locala = this.twQ;
      boolean bool = paramBoolean.booleanValue();
      locala.waR.vYk = bool;
      if (paramBoolean.booleanValue()) {
        this.twQ.VB(this.mContext.getString(R.l.dit));
      }
      GMTrace.o(964622811136L, 7187);
      return this;
    }
    
    public final a zf(int paramInt)
    {
      GMTrace.i(964891246592L, 7189);
      this.twR = this.mContext.getResources().getString(paramInt);
      GMTrace.o(964891246592L, 7189);
      return this;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\ui\applet\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */