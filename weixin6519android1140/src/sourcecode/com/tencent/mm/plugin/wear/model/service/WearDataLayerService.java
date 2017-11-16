package com.tencent.mm.plugin.wear.model.service;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.Channel;
import com.google.android.gms.wearable.WearableListenerService;
import com.google.android.gms.wearable.d;
import com.google.android.gms.wearable.f;
import com.google.android.gms.wearable.i;
import com.google.android.gms.wearable.j;
import com.google.android.gms.wearable.l;
import com.google.android.gms.wearable.m;
import com.jg.JgClassChecked;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.g;
import com.tencent.mm.sdk.platformtools.w;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;

@JgClassChecked(author=100, fComment="checked", lastDate="20141125", reviewer=20, vComment={com.jg.EType.SERVICESCHECK})
public class WearDataLayerService
  extends WearableListenerService
{
  public WearDataLayerService()
  {
    GMTrace.i(9194585456640L, 68505);
    GMTrace.o(9194585456640L, 68505);
  }
  
  private static Bundle aT(byte[] paramArrayOfByte)
  {
    GMTrace.i(9195122327552L, 68509);
    Bundle localBundle = new Bundle();
    DataInputStream localDataInputStream = new DataInputStream(new ByteArrayInputStream(paramArrayOfByte));
    int i = localDataInputStream.readInt();
    localBundle.putInt("key_connecttype", i);
    int j = localDataInputStream.readInt();
    localBundle.putInt("key_sessionid", j);
    int k = localDataInputStream.readInt();
    localBundle.putInt("key_funid", k);
    int m = localDataInputStream.readInt();
    if ((m > 0) && (m < paramArrayOfByte.length))
    {
      paramArrayOfByte = new byte[m];
      localDataInputStream.readFully(paramArrayOfByte);
      localBundle.putByteArray("key_data", paramArrayOfByte);
    }
    while (m < paramArrayOfByte.length)
    {
      w.i("MicroMsg.Wear.WearDataLayerService", "receive data connectType=%d sessionId=%d funId=%d contentLength=%d", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(m) });
      GMTrace.o(9195122327552L, 68509);
      return localBundle;
    }
    throw new IOException("contentLength too large " + m);
  }
  
  public final void a(Channel paramChannel)
  {
    GMTrace.i(18827391795200L, 140275);
    String str1 = paramChannel.getPath();
    String str2 = paramChannel.mZ();
    Object localObject = g.n(str1.getBytes());
    localObject = new File(com.tencent.mm.compatible.util.e.fRY, (String)localObject);
    w.i("MicroMsg.Wear.WearDataLayerService", "onChannelOpened %s %s %s", new Object[] { str1, str2, ((File)localObject).getAbsolutePath() });
    if (((File)localObject).exists()) {
      ((File)localObject).delete();
    }
    if (!((File)localObject).getParentFile().exists()) {
      ((File)localObject).getParentFile().mkdirs();
    }
    try
    {
      ((File)localObject).createNewFile();
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        try
        {
          paramChannel.a(new com.tencent.mm.plugin.wear.model.a.a().bBw(), Uri.fromFile((File)localObject));
          GMTrace.o(18827391795200L, 140275);
          return;
        }
        catch (Exception paramChannel)
        {
          w.printErrStackTrace("MicroMsg.Wear.WearDataLayerService", paramChannel, "fuck Xiao Mi", new Object[0]);
          GMTrace.o(18827391795200L, 140275);
        }
        localIOException = localIOException;
        w.printErrStackTrace("MicroMsg.Wear.WearDataLayerService", localIOException, "onChannelOpened", new Object[0]);
      }
    }
  }
  
  public final void a(Channel paramChannel, int paramInt1, int paramInt2)
  {
    GMTrace.i(18827794448384L, 140278);
    w.i("MicroMsg.Wear.WearDataLayerService", "onChannelClosed %s %s %d %d", new Object[] { paramChannel.getPath(), paramChannel.mZ(), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    GMTrace.o(18827794448384L, 140278);
  }
  
  public final void a(com.google.android.gms.wearable.e parame)
  {
    GMTrace.i(9194988109824L, 68508);
    w.i("MicroMsg.Wear.WearDataLayerService", "onDataChanged %d %s", new Object[] { Integer.valueOf(parame.getCount()), parame.azP });
    Iterator localIterator = parame.iterator();
    for (;;)
    {
      if (localIterator.hasNext())
      {
        Object localObject = (d)localIterator.next();
        if (((d)localObject).getType() != 1) {
          continue;
        }
        Uri localUri = ((d)localObject).na().getUri();
        if (!com.tencent.mm.plugin.wear.a.b.La(localUri.getPath())) {
          continue;
        }
        localObject = ((d)localObject).na();
        if (localObject == null) {
          throw new IllegalStateException("provided dataItem is null");
        }
        localObject = new j((f)localObject).aAo.aD("key_data");
        if (localObject != null)
        {
          localObject = new com.tencent.mm.plugin.wear.model.a.a().a((Asset)localObject);
          if (localObject == null)
          {
            GMTrace.o(9194988109824L, 68508);
            return;
          }
        }
        try
        {
          w.i("MicroMsg.Wear.WearDataLayerService", "receive data = %d", new Object[] { Integer.valueOf(localObject.length) });
          com.tencent.mm.plugin.wear.model.b.a.M(aT((byte[])localObject));
          new com.tencent.mm.plugin.wear.model.a.a().g(localUri);
        }
        catch (IOException localIOException)
        {
          for (;;)
          {
            w.printErrStackTrace("MicroMsg.Wear.WearDataLayerService", localIOException, "decode data error", new Object[0]);
          }
        }
      }
    }
    parame.release();
    GMTrace.o(9194988109824L, 68508);
  }
  
  public final void a(l paraml)
  {
    GMTrace.i(9195256545280L, 68510);
    w.i("MicroMsg.Wear.WearDataLayerService", "onMessageReceived %s", new Object[] { paraml.getPath() });
    if (com.tencent.mm.plugin.wear.a.b.La(paraml.getPath())) {
      try
      {
        paraml = paraml.getData();
        w.i("MicroMsg.Wear.WearDataLayerService", "receive data = %d", new Object[] { Integer.valueOf(paraml.length) });
        com.tencent.mm.plugin.wear.model.b.a.M(aT(paraml));
        GMTrace.o(9195256545280L, 68510);
        return;
      }
      catch (IOException paraml)
      {
        w.printErrStackTrace("MicroMsg.Wear.WearDataLayerService", paraml, "decode message error", new Object[0]);
      }
    }
    GMTrace.o(9195256545280L, 68510);
  }
  
  public final void a(m paramm)
  {
    GMTrace.i(9195390763008L, 68511);
    w.i("MicroMsg.Wear.WearDataLayerService", "onPeerConnected %s", new Object[] { paramm.getId() });
    Bundle localBundle = new Bundle();
    localBundle.putInt("key_connecttype", 3);
    localBundle.putInt("key_funid", 1);
    localBundle.putByteArray("key_data", paramm.getId().getBytes());
    com.tencent.mm.plugin.wear.model.b.a.M(localBundle);
    GMTrace.o(9195390763008L, 68511);
  }
  
  public final void b(Channel paramChannel, int paramInt1, int paramInt2)
  {
    GMTrace.i(18827526012928L, 140276);
    String str = paramChannel.getPath();
    w.i("MicroMsg.Wear.WearDataLayerService", "onInputClosed %s %s %d %d", new Object[] { str, paramChannel.mZ(), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (paramInt1 == 0)
    {
      paramChannel = g.n(str.getBytes());
      paramChannel = new File(com.tencent.mm.compatible.util.e.fRY, paramChannel);
      w.i("MicroMsg.Wear.WearDataLayerService", "onInputClosed %s, %d", new Object[] { paramChannel.getAbsolutePath(), Long.valueOf(paramChannel.length()) });
      Bundle localBundle = new Bundle();
      localBundle.putInt("key_connecttype", 1);
      localBundle.putInt("key_funid", com.tencent.mm.plugin.wear.a.b.Lb(str));
      localBundle.putInt("key_sessionid", 0);
      localBundle.putByteArray("key_data", paramChannel.getAbsolutePath().getBytes());
      com.tencent.mm.plugin.wear.model.b.a.M(localBundle);
    }
    GMTrace.o(18827526012928L, 140276);
  }
  
  public final void b(m paramm)
  {
    GMTrace.i(9195524980736L, 68512);
    w.i("MicroMsg.Wear.WearDataLayerService", "onPeerDisconnected %s", new Object[] { paramm.getId() });
    Bundle localBundle = new Bundle();
    localBundle.putInt("key_connecttype", 3);
    localBundle.putInt("key_funid", -1);
    localBundle.putByteArray("key_data", paramm.getId().getBytes());
    com.tencent.mm.plugin.wear.model.b.a.M(localBundle);
    GMTrace.o(9195524980736L, 68512);
  }
  
  public final void c(Channel paramChannel, int paramInt1, int paramInt2)
  {
    GMTrace.i(18827660230656L, 140277);
    w.i("MicroMsg.Wear.WearDataLayerService", "onOutputClosed %s %s %d %d", new Object[] { paramChannel.getPath(), paramChannel.mZ(), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    GMTrace.o(18827660230656L, 140277);
  }
  
  public void onCreate()
  {
    GMTrace.i(9194719674368L, 68506);
    super.onCreate();
    w.i("MicroMsg.Wear.WearDataLayerService", "onCreate");
    GMTrace.o(9194719674368L, 68506);
  }
  
  public void onDestroy()
  {
    GMTrace.i(9194853892096L, 68507);
    w.i("MicroMsg.Wear.WearDataLayerService", "onDestroy");
    super.onDestroy();
    GMTrace.o(9194853892096L, 68507);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wear\model\service\WearDataLayerService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */