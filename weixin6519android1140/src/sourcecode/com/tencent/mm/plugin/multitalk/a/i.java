package com.tencent.mm.plugin.multitalk.a;

import android.content.Context;
import android.content.Intent;
import android.telephony.TelephonyManager;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.y.q;
import com.tencent.pb.talkroom.sdk.MultiTalkGroup;
import com.tencent.pb.talkroom.sdk.MultiTalkGroupMember;
import java.util.Iterator;
import java.util.List;

public final class i
{
  public static final float[][] nmV;
  
  static
  {
    GMTrace.i(4766876827648L, 35516);
    float[][] arrayOfFloat = new float[6][];
    nmV = arrayOfFloat;
    arrayOfFloat[0] = null;
    nmV[1] = { 0.5F, 0.5F };
    nmV[2] = { 0.0F, 0.5F, 1.0F, 0.5F };
    nmV[3] = { 0.0F, 0.0F, 1.0F, 0.0F, 0.5F, 1.0F };
    nmV[4] = { 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F };
    nmV[5] = { 0.0F, 0.0F, 1.0F, 0.0F, 2.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 2.0F, 1.0F, 2.0F, 2.0F, 2.0F };
    GMTrace.o(4766876827648L, 35516);
  }
  
  public static boolean a(MultiTalkGroup paramMultiTalkGroup1, MultiTalkGroup paramMultiTalkGroup2)
  {
    GMTrace.i(4764997779456L, 35502);
    if ((paramMultiTalkGroup1 == null) || (paramMultiTalkGroup2 == null))
    {
      GMTrace.o(4764997779456L, 35502);
      return false;
    }
    if ((!bg.nm(paramMultiTalkGroup1.xOx)) && (!bg.nm(paramMultiTalkGroup2.xOx)) && (paramMultiTalkGroup1.xOx.equals(paramMultiTalkGroup2.xOx)))
    {
      GMTrace.o(4764997779456L, 35502);
      return true;
    }
    if ((!bg.nm(paramMultiTalkGroup1.xOy)) && (!bg.nm(paramMultiTalkGroup2.xOy)) && (paramMultiTalkGroup1.xOy.equals(paramMultiTalkGroup2.xOy)))
    {
      GMTrace.o(4764997779456L, 35502);
      return true;
    }
    GMTrace.o(4764997779456L, 35502);
    return false;
  }
  
  public static String aRH()
  {
    GMTrace.i(4765803085824L, 35508);
    String str = l(o.aRR().nmp);
    GMTrace.o(4765803085824L, 35508);
    return str;
  }
  
  public static String aRI()
  {
    GMTrace.i(4766071521280L, 35510);
    String str = m(o.aRR().nmp);
    GMTrace.o(4766071521280L, 35510);
    return str;
  }
  
  public static boolean aRJ()
  {
    GMTrace.i(4766205739008L, 35511);
    GMTrace.o(4766205739008L, 35511);
    return false;
  }
  
  public static a aRK()
  {
    GMTrace.i(4766742609920L, 35515);
    if (am.isWifi(ab.getContext()))
    {
      locala = a.nmW;
      GMTrace.o(4766742609920L, 35515);
      return locala;
    }
    if (am.is4G(ab.getContext()))
    {
      locala = a.nmX;
      GMTrace.o(4766742609920L, 35515);
      return locala;
    }
    if ((am.is3G(ab.getContext())) || (am.is2G(ab.getContext())))
    {
      locala = a.nmY;
      GMTrace.o(4766742609920L, 35515);
      return locala;
    }
    a locala = a.nmZ;
    GMTrace.o(4766742609920L, 35515);
    return locala;
  }
  
  public static boolean c(com.tencent.mm.plugin.multitalk.ui.widget.e parame)
  {
    GMTrace.i(4765400432640L, 35505);
    if ((parame == com.tencent.mm.plugin.multitalk.ui.widget.e.noG) || (parame == com.tencent.mm.plugin.multitalk.ui.widget.e.noH) || (parame == com.tencent.mm.plugin.multitalk.ui.widget.e.noE))
    {
      GMTrace.o(4765400432640L, 35505);
      return true;
    }
    GMTrace.o(4765400432640L, 35505);
    return false;
  }
  
  public static String h(MultiTalkGroup paramMultiTalkGroup)
  {
    GMTrace.i(4764863561728L, 35501);
    if (paramMultiTalkGroup == null)
    {
      GMTrace.o(4764863561728L, 35501);
      return "";
    }
    StringBuffer localStringBuffer = new StringBuffer();
    Object localObject = paramMultiTalkGroup.xOB;
    localStringBuffer.append("->[usernamelist]");
    if (localObject != null)
    {
      localObject = ((List)localObject).iterator();
      while (((Iterator)localObject).hasNext())
      {
        MultiTalkGroupMember localMultiTalkGroupMember = (MultiTalkGroupMember)((Iterator)localObject).next();
        localStringBuffer.append(localMultiTalkGroupMember.xOC + "|");
        localStringBuffer.append(localMultiTalkGroupMember.status + ", ");
      }
    }
    localStringBuffer.append(" ->createname:" + paramMultiTalkGroup.xOA);
    localStringBuffer.append(" ->talkgroupId:" + paramMultiTalkGroup.xOx);
    localStringBuffer.append(" ->wxGroupId:" + paramMultiTalkGroup.xOz);
    paramMultiTalkGroup = localStringBuffer.toString();
    GMTrace.o(4764863561728L, 35501);
    return paramMultiTalkGroup;
  }
  
  public static boolean i(MultiTalkGroup paramMultiTalkGroup)
  {
    GMTrace.i(4765131997184L, 35503);
    if (paramMultiTalkGroup == null)
    {
      GMTrace.o(4765131997184L, 35503);
      return false;
    }
    paramMultiTalkGroup = paramMultiTalkGroup.xOB.iterator();
    int i = 0;
    int j = 0;
    while (paramMultiTalkGroup.hasNext())
    {
      MultiTalkGroupMember localMultiTalkGroupMember = (MultiTalkGroupMember)paramMultiTalkGroup.next();
      if (localMultiTalkGroupMember.xOC.equals(q.zE()))
      {
        if (localMultiTalkGroupMember.status != 10) {
          break label134;
        }
        if (i != 0)
        {
          GMTrace.o(4765131997184L, 35503);
          return true;
        }
        j = 1;
      }
      else
      {
        if (localMultiTalkGroupMember.status != 10) {
          break label134;
        }
        if (j != 0)
        {
          GMTrace.o(4765131997184L, 35503);
          return true;
        }
        i = 1;
      }
    }
    label134:
    for (;;)
    {
      break;
      GMTrace.o(4765131997184L, 35503);
      return false;
    }
  }
  
  public static boolean j(MultiTalkGroup paramMultiTalkGroup)
  {
    GMTrace.i(4765266214912L, 35504);
    paramMultiTalkGroup = paramMultiTalkGroup.xOB.iterator();
    int i = 0;
    if (paramMultiTalkGroup.hasNext())
    {
      MultiTalkGroupMember localMultiTalkGroupMember = (MultiTalkGroupMember)paramMultiTalkGroup.next();
      if ((localMultiTalkGroupMember.status != 10) && (localMultiTalkGroupMember.status != 1)) {
        break label88;
      }
      i += 1;
    }
    label88:
    for (;;)
    {
      break;
      if (i > 1)
      {
        GMTrace.o(4765266214912L, 35504);
        return true;
      }
      GMTrace.o(4765266214912L, 35504);
      return false;
    }
  }
  
  public static boolean k(MultiTalkGroup paramMultiTalkGroup)
  {
    GMTrace.i(4765534650368L, 35506);
    boolean bool = paramMultiTalkGroup.xOA.equals(q.zE());
    GMTrace.o(4765534650368L, 35506);
    return bool;
  }
  
  public static String l(MultiTalkGroup paramMultiTalkGroup)
  {
    GMTrace.i(4765668868096L, 35507);
    if (paramMultiTalkGroup == null)
    {
      GMTrace.o(4765668868096L, 35507);
      return "";
    }
    String str2 = paramMultiTalkGroup.xOx;
    String str1 = str2;
    if (bg.nm(str2)) {
      str1 = paramMultiTalkGroup.xOy;
    }
    paramMultiTalkGroup = bg.aq(str1, "");
    GMTrace.o(4765668868096L, 35507);
    return paramMultiTalkGroup;
  }
  
  public static String m(MultiTalkGroup paramMultiTalkGroup)
  {
    GMTrace.i(4765937303552L, 35509);
    String str = null;
    int i = 0;
    if (i < paramMultiTalkGroup.xOB.size())
    {
      if (!((MultiTalkGroupMember)paramMultiTalkGroup.xOB.get(i)).xOC.equals(q.zE())) {
        break label84;
      }
      str = ((MultiTalkGroupMember)paramMultiTalkGroup.xOB.get(i)).xOD;
    }
    label84:
    for (;;)
    {
      i += 1;
      break;
      GMTrace.o(4765937303552L, 35509);
      return str;
    }
  }
  
  public static int q(Context paramContext, Intent paramIntent)
  {
    GMTrace.i(4766339956736L, 35512);
    if (paramIntent != null)
    {
      paramIntent = paramIntent.getStringExtra("state");
      if (paramIntent != null)
      {
        if (paramIntent.equals("IDLE"))
        {
          GMTrace.o(4766339956736L, 35512);
          return 0;
        }
        if (paramIntent.equals("RINGING"))
        {
          GMTrace.o(4766339956736L, 35512);
          return 1;
        }
        if (paramIntent.equals("OFFHOOK"))
        {
          GMTrace.o(4766339956736L, 35512);
          return 2;
        }
      }
    }
    int i = ((TelephonyManager)paramContext.getSystemService("phone")).getCallState();
    GMTrace.o(4766339956736L, 35512);
    return i;
  }
  
  public static boolean rd(int paramInt)
  {
    GMTrace.i(4766474174464L, 35513);
    if ((paramInt == 2) || (paramInt == 3))
    {
      GMTrace.o(4766474174464L, 35513);
      return true;
    }
    GMTrace.o(4766474174464L, 35513);
    return false;
  }
  
  public static boolean re(int paramInt)
  {
    GMTrace.i(4766608392192L, 35514);
    if ((paramInt == 1) || (paramInt == 3))
    {
      GMTrace.o(4766608392192L, 35514);
      return true;
    }
    GMTrace.o(4766608392192L, 35514);
    return false;
  }
  
  public static enum a
  {
    static
    {
      GMTrace.i(4762581860352L, 35484);
      nmW = new a("WIFI", 0);
      nmX = new a("_4G", 1);
      nmY = new a("_3GOr_2G", 2);
      nmZ = new a("None", 3);
      nna = new a[] { nmW, nmX, nmY, nmZ };
      GMTrace.o(4762581860352L, 35484);
    }
    
    private a()
    {
      GMTrace.i(4762447642624L, 35483);
      GMTrace.o(4762447642624L, 35483);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\multitalk\a\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */