package com.tencent.mm.plugin.wear.model.e;

import android.content.Intent;
import android.os.Build.VERSION;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bj.d;
import com.tencent.mm.g.a.kp;
import com.tencent.mm.g.a.ni;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.plugin.messenger.foundation.a.a.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import java.util.ArrayList;
import java.util.List;

public final class e
  extends a
{
  public e()
  {
    GMTrace.i(9201833213952L, 68559);
    GMTrace.o(9201833213952L, 68559);
  }
  
  public final List<Integer> bBA()
  {
    GMTrace.i(9201967431680L, 68560);
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(Integer.valueOf(11013));
    localArrayList.add(Integer.valueOf(11014));
    localArrayList.add(Integer.valueOf(11015));
    GMTrace.o(9201967431680L, 68560);
    return localArrayList;
  }
  
  protected final byte[] m(int paramInt, byte[] paramArrayOfByte)
  {
    GMTrace.i(9202101649408L, 68561);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(9202101649408L, 68561);
      return null;
      paramArrayOfByte = new kp();
      com.tencent.mm.sdk.b.a.vgX.m(paramArrayOfByte);
      continue;
      paramArrayOfByte = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().aOm();
      if (paramArrayOfByte.size() == 1)
      {
        paramArrayOfByte = ((au)paramArrayOfByte.get(0)).field_talker;
        Intent localIntent = new Intent();
        localIntent.putExtra("Main_User", paramArrayOfByte);
        localIntent.putExtra("From_fail_notify", true);
        localIntent.addFlags(67108864);
        localIntent.addFlags(536870912);
        if (Build.VERSION.SDK_INT < 16) {
          localIntent.putExtra("resend_fail_messages", true);
        }
        w.d("MicroMsg.Wear.HttpFailMsgServer", "startChattingUI talker=%s", new Object[] { paramArrayOfByte });
        d.a(ab.getContext(), "com.tencent.mm.ui.LauncherUI", localIntent);
      }
      else
      {
        paramArrayOfByte = new Intent();
        paramArrayOfByte.addFlags(67108864);
        paramArrayOfByte.addFlags(536870912);
        if (Build.VERSION.SDK_INT < 16) {
          paramArrayOfByte.putExtra("resend_fail_messages", true);
        }
        paramArrayOfByte.putExtra("From_fail_notify", true);
        w.d("MicroMsg.Wear.HttpFailMsgServer", "startMainUI");
        d.a(ab.getContext(), "com.tencent.mm.ui.LauncherUI", paramArrayOfByte);
        continue;
        paramArrayOfByte = new ni();
        com.tencent.mm.sdk.b.a.vgX.m(paramArrayOfByte);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wear\model\e\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */