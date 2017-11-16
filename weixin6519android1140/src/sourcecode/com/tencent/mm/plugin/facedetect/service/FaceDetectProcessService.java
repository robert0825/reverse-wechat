package com.tencent.mm.plugin.facedetect.service;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.facedetect.FaceProNative;
import com.tencent.mm.plugin.facedetect.FaceProNative.FaceResult;
import com.tencent.mm.plugin.facedetect.model.FaceContextData;
import com.tencent.mm.plugin.facedetect.model.f;
import com.tencent.mm.plugin.facedetect.model.g;
import com.tencent.mm.plugin.facedetect.model.n;
import com.tencent.mm.plugin.facedetect.model.o;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.w;

public class FaceDetectProcessService
  extends Service
{
  private a kUQ;
  public g kUR;
  private Messenger kUS;
  private a kUT;
  
  public FaceDetectProcessService()
  {
    GMTrace.i(5966380662784L, 44453);
    this.kUQ = new a();
    this.kUR = null;
    this.kUS = null;
    this.kUT = null;
    GMTrace.o(5966380662784L, 44453);
  }
  
  private void cb(int paramInt1, int paramInt2)
  {
    GMTrace.i(5967320186880L, 44460);
    w.i("MicroMsg.FaceDetectProcessService", "alvinluo replyToClient requestCode: %d, resultCode: %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    Message localMessage = new Message();
    localMessage.what = paramInt1;
    localMessage.arg1 = paramInt2;
    j(localMessage);
    GMTrace.o(5967320186880L, 44460);
  }
  
  private void j(Message paramMessage)
  {
    GMTrace.i(5967185969152L, 44459);
    try
    {
      if (this.kUS != null)
      {
        w.i("MicroMsg.FaceDetectProcessService", "alvinluo serivce send msg to client: %d, msg: %s, client hashCode: %d", new Object[] { Integer.valueOf(paramMessage.what), paramMessage.toString(), Integer.valueOf(this.kUS.hashCode()) });
        this.kUS.send(paramMessage);
      }
      GMTrace.o(5967185969152L, 44459);
      return;
    }
    catch (RemoteException paramMessage)
    {
      w.printErrStackTrace("MicroMsg.FaceDetectProcessService", paramMessage, "", new Object[0]);
      GMTrace.o(5967185969152L, 44459);
    }
  }
  
  public IBinder onBind(Intent paramIntent)
  {
    GMTrace.i(5966783315968L, 44456);
    w.i("MicroMsg.FaceDetectProcessService", "alvinluo service onBind hashCode: %d", new Object[] { Integer.valueOf(hashCode()) });
    this.kUQ = new a();
    paramIntent = this.kUQ;
    GMTrace.o(5966783315968L, 44456);
    return paramIntent;
  }
  
  public void onCreate()
  {
    GMTrace.i(5966514880512L, 44454);
    w.i("MicroMsg.FaceDetectProcessService", "alvinluo service onCreate hashCode: %d", new Object[] { Integer.valueOf(hashCode()) });
    super.onCreate();
    this.kUR = new g();
    GMTrace.o(5966514880512L, 44454);
  }
  
  public void onDestroy()
  {
    GMTrace.i(5967051751424L, 44458);
    w.i("MicroMsg.FaceDetectProcessService", "alvinluo service onDestroy");
    super.onDestroy();
    GMTrace.o(5967051751424L, 44458);
  }
  
  public int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    GMTrace.i(5966649098240L, 44455);
    w.i("MicroMsg.FaceDetectProcessService", "alvinluo onStartCommand");
    if (paramIntent == null)
    {
      w.e("MicroMsg.FaceDetectProcessService", "intent is null!!");
      paramInt1 = super.onStartCommand(paramIntent, paramInt1, paramInt2);
      GMTrace.o(5966649098240L, 44455);
      return paramInt1;
    }
    Object localObject = (Messenger)paramIntent.getParcelableExtra("k_messenger");
    if (localObject != null)
    {
      this.kUS = ((Messenger)localObject);
      paramInt1 = super.onStartCommand(paramIntent, paramInt1, paramInt2);
      GMTrace.o(5966649098240L, 44455);
      return paramInt1;
    }
    int i = paramIntent.getIntExtra("k_cmd", -1);
    w.i("MicroMsg.FaceDetectProcessService", "hy: get command: %d", new Object[] { Integer.valueOf(i) });
    switch (i)
    {
    case 2: 
    case 3: 
    default: 
      w.e("MicroMsg.FaceDetectProcessService", "hy: unsupported cmd");
    }
    for (;;)
    {
      paramInt1 = super.onStartCommand(paramIntent, paramInt1, paramInt2);
      GMTrace.o(5966649098240L, 44455);
      return paramInt1;
      String str = paramIntent.getStringExtra("k_bio_id");
      byte[] arrayOfByte = paramIntent.getByteArrayExtra("k_bio_config");
      FaceContextData.a((FaceContextData)paramIntent.getParcelableExtra("k_ontext_data"));
      switch (paramIntent.getIntExtra("k_server_scene", 2))
      {
      case 3: 
      case 4: 
      default: 
        localObject = null;
        label255:
        this.kUT = ((a)localObject);
        localObject = this.kUR;
        if (((g)localObject).kSQ != null)
        {
          w.w("MicroMsg.FaceDetectNativeManager", "hy: last detection not destroyed");
          ((g)localObject).awq();
        }
        if (!n.awu())
        {
          w.w("MicroMsg.FaceDetectNativeManager", "hy: model file not valid");
          i = -4;
        }
        break;
      }
      for (;;)
      {
        cb(0, i);
        break;
        localObject = null;
        break label255;
        localObject = new b();
        break label255;
        ((g)localObject).kSQ = new FaceProNative();
        i = ((g)localObject).kSQ.engineInit(str, arrayOfByte, n.aww(), n.awx());
        w.i("MicroMsg.FaceDetectNativeManager", "hy: init result : %d", new Object[] { Integer.valueOf(i) });
      }
      f.r(new Runnable()
      {
        public final void b(final FaceProNative.FaceResult paramAnonymousFaceResult)
        {
          int j = -1;
          GMTrace.i(5969199235072L, 44474);
          boolean bool;
          if (paramAnonymousFaceResult == null)
          {
            bool = true;
            if (paramAnonymousFaceResult == null) {
              break label104;
            }
          }
          label104:
          for (int i = paramAnonymousFaceResult.result;; i = -1)
          {
            w.i("MicroMsg.FaceDetectProcessService", "alvinluo release out result == null:%b, result: %d", new Object[] { Boolean.valueOf(bool), Integer.valueOf(i) });
            if ((paramAnonymousFaceResult != null) && (paramAnonymousFaceResult.result == 0)) {
              break label109;
            }
            w.i("MicroMsg.FaceDetectProcessService", "alvinluo release out data not valid");
            i = j;
            if (paramAnonymousFaceResult != null) {
              i = paramAnonymousFaceResult.result;
            }
            FaceDetectProcessService.a(FaceDetectProcessService.this, i);
            GMTrace.o(5969199235072L, 44474);
            return;
            bool = false;
            break;
          }
          label109:
          f.r(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(5970809847808L, 44486);
              String str = n.a(paramAnonymousFaceResult);
              Bundle localBundle = new Bundle();
              localBundle.putInt("key_face_result_code", 0);
              localBundle.putString("key_face_result_file_path", str);
              FaceDetectProcessService.a(FaceDetectProcessService.this, localBundle);
              GMTrace.o(5970809847808L, 44486);
            }
          });
          GMTrace.o(5969199235072L, 44474);
        }
      }
      {
        public final void run()
        {
          GMTrace.i(5967857057792L, 44464);
          w.i("MicroMsg.FaceDetectProcessService", "alvinluo service do release out");
          af.t(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(5969736105984L, 44478);
              FaceDetectProcessService.2.this.kUX.b(this.kUY);
              GMTrace.o(5969736105984L, 44478);
            }
          });
          GMTrace.o(5967857057792L, 44464);
        }
      });
      continue;
      boolean bool = paramIntent.getBooleanExtra("key_is_need_video", false);
      com.tencent.mm.plugin.facedetect.e.a.axb().kXz = bool;
      continue;
      if (this.kUT != null) {
        this.kUT.A(paramIntent);
      }
    }
  }
  
  public boolean onUnbind(Intent paramIntent)
  {
    GMTrace.i(5966917533696L, 44457);
    w.i("MicroMsg.FaceDetectProcessService", "alvinluo service onUnbind");
    boolean bool = super.onUnbind(paramIntent);
    GMTrace.o(5966917533696L, 44457);
    return bool;
  }
  
  public final class a
    extends Binder
  {
    public a()
    {
      GMTrace.i(5967991275520L, 44465);
      GMTrace.o(5967991275520L, 44465);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\facedetect\service\FaceDetectProcessService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */