package com.tencent.mm.modelrecovery;

import com.tencent.gmtrace.GMTrace;
import com.tencent.recovery.RecoveryLogic;
import com.tencent.recovery.log.RecoveryLog;
import com.tencent.recovery.model.RecoveryHandleItem;
import com.tencent.recovery.option.CommonOptions;
import com.tencent.recovery.option.OptionFactory;
import com.tencent.recovery.wx.service.WXRecoveryUploadService;
import com.tencent.tinker.lib.service.AbstractResultService;
import com.tencent.tinker.lib.service.a;
import java.util.ArrayList;

public class RecoveryTinkerResultService
  extends AbstractResultService
{
  public RecoveryTinkerResultService()
  {
    GMTrace.i(4512400015360L, 33620);
    GMTrace.o(4512400015360L, 33620);
  }
  
  public final void a(a parama)
  {
    GMTrace.i(4512802668544L, 33623);
    RecoveryLog.i("Recovery.RecoveryTinkerResultService", "RecoveryTinkerResultService receive result: %s", new Object[] { parama });
    CommonOptions localCommonOptions = OptionFactory.fN(this);
    ArrayList localArrayList = new ArrayList();
    RecoveryHandleItem localRecoveryHandleItem = new RecoveryHandleItem();
    localRecoveryHandleItem.lOv = localCommonOptions.lOv;
    localRecoveryHandleItem.clientVersion = localCommonOptions.clientVersion;
    localRecoveryHandleItem.timestamp = System.currentTimeMillis();
    localRecoveryHandleItem.amf = "KeyPatchResultTotalCount";
    if (parama.eFN)
    {
      RecoveryLog.i("Recovery.RecoveryTinkerResultService", "patch success", new Object[0]);
      localRecoveryHandleItem.amf = "KeyPatchResultSuccessCount";
    }
    for (;;)
    {
      localArrayList.add(localRecoveryHandleItem);
      RecoveryLogic.a(this, localArrayList, WXRecoveryUploadService.class.getName());
      stopSelf();
      GMTrace.o(4512802668544L, 33623);
      return;
      RecoveryLog.i("Recovery.RecoveryTinkerResultService", "patch fail ", new Object[0]);
      if (parama.xPC != null)
      {
        RecoveryLog.i("Recovery.RecoveryTinkerResultService", "fail reason %s", new Object[] { parama.xPC.getMessage() });
        localRecoveryHandleItem.amf = String.format("%s[%s]", new Object[] { "KeyPatchResultFailCount", parama.xPC.getMessage() });
      }
      else
      {
        localRecoveryHandleItem.amf = "KeyPatchResultFailCount";
      }
    }
  }
  
  public void onCreate()
  {
    GMTrace.i(4512534233088L, 33621);
    super.onCreate();
    RecoveryLog.i("Recovery.RecoveryTinkerResultService", "onCreate", new Object[0]);
    GMTrace.o(4512534233088L, 33621);
  }
  
  public void onDestroy()
  {
    GMTrace.i(4512668450816L, 33622);
    RecoveryLog.i("Recovery.RecoveryTinkerResultService", "onDestroy", new Object[0]);
    super.onDestroy();
    GMTrace.o(4512668450816L, 33622);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\modelrecovery\RecoveryTinkerResultService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */