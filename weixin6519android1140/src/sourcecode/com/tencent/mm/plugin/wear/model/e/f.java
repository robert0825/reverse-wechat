package com.tencent.mm.plugin.wear.model.e;

import android.content.Context;
import android.content.Intent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

public final class f
  extends a
{
  public f()
  {
    GMTrace.i(9198075117568L, 68531);
    GMTrace.o(9198075117568L, 68531);
  }
  
  public final List<Integer> bBA()
  {
    GMTrace.i(9198209335296L, 68532);
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(Integer.valueOf(11016));
    localArrayList.add(Integer.valueOf(11017));
    localArrayList.add(Integer.valueOf(11018));
    GMTrace.o(9198209335296L, 68532);
    return localArrayList;
  }
  
  protected final byte[] m(int paramInt, byte[] paramArrayOfByte)
  {
    GMTrace.i(9198343553024L, 68533);
    try
    {
      paramArrayOfByte = new String(paramArrayOfByte, "utf8");
      if (bg.nm(paramArrayOfByte))
      {
        w.i("MicroMsg.Wear.HttpFriendServer", "error to get username");
        GMTrace.o(9198343553024L, 68533);
        return null;
      }
    }
    catch (UnsupportedEncodingException paramArrayOfByte)
    {
      for (;;)
      {
        paramArrayOfByte = "";
      }
      w.i("MicroMsg.Wear.HttpFriendServer", "handle friend request %s", new Object[] { paramArrayOfByte });
      if (paramInt != 11016) {
        break label162;
      }
    }
    Intent localIntent = new Intent();
    localIntent.setClassName(ab.getPackageName(), ab.getPackageName() + ".plugin.subapp.ui.friend.FMessageTransferUI");
    localIntent.putExtra("friend_message_transfer_username", paramArrayOfByte);
    localIntent.setAction("friend_message_accept_" + paramArrayOfByte);
    localIntent.setFlags(335544320);
    ab.getContext().startActivity(localIntent);
    for (;;)
    {
      GMTrace.o(9198343553024L, 68533);
      return null;
      label162:
      if (paramInt == 11017)
      {
        localIntent = new Intent();
        localIntent.setClassName(ab.getPackageName(), ab.getPackageName() + ".plugin.subapp.ui.friend.FMessageTransferUI");
        localIntent.putExtra("friend_message_transfer_username", paramArrayOfByte);
        localIntent.setAction("friend_message_ignore_" + paramArrayOfByte);
        localIntent.setFlags(335544320);
        ab.getContext().startActivity(localIntent);
      }
      else if (paramInt == 11018)
      {
        paramArrayOfByte = new Intent();
        paramArrayOfByte.setClassName(ab.getPackageName(), ab.getPackageName() + ".plugin.subapp.ui.friend.FMessageConversationUI");
        paramArrayOfByte.setFlags(335544320);
        ab.getContext().startActivity(paramArrayOfByte);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wear\model\e\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */