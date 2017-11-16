package com.tencent.mm.plugin.report.kvdata;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public class SDStatusInfo
  extends com.tencent.mm.bm.a
{
  public long eAvailableBlockCount_;
  public int eAvailablePer_;
  public long eAvailableSize_;
  public long eBlockCount_;
  public long eBlockSize_;
  public String ePath_;
  public long eTotalSize_;
  public String fSystem_;
  public int hasUnRemovable_;
  public int ratioHeavy_;
  public String root_;
  public long sAvailableBlockCount_;
  public int sAvailablePer_;
  public long sAvailableSize_;
  public long sBlockCount_;
  public long sBlockSize_;
  public long sTotalSize_;
  public int sizeHeavy_;
  public int useExternal_;
  public int weChatPer_;
  public WeChatSDInfo weChatSDInfo_;
  
  public SDStatusInfo()
  {
    GMTrace.i(17507226222592L, 130439);
    GMTrace.o(17507226222592L, 130439);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(17507360440320L, 130440);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.weChatSDInfo_ == null) {
        throw new b("Not all required fields were included: weChatSDInfo_");
      }
      if (this.weChatSDInfo_ != null)
      {
        paramVarArgs.fm(1, this.weChatSDInfo_.aYq());
        this.weChatSDInfo_.a(paramVarArgs);
      }
      paramVarArgs.fk(2, this.weChatPer_);
      paramVarArgs.fk(3, this.sizeHeavy_);
      paramVarArgs.fk(4, this.ratioHeavy_);
      paramVarArgs.fk(5, this.useExternal_);
      paramVarArgs.fk(6, this.hasUnRemovable_);
      paramVarArgs.T(7, this.sBlockSize_);
      paramVarArgs.T(8, this.sBlockCount_);
      paramVarArgs.T(9, this.sTotalSize_);
      paramVarArgs.T(10, this.sAvailableBlockCount_);
      paramVarArgs.T(11, this.sAvailableSize_);
      paramVarArgs.fk(12, this.sAvailablePer_);
      paramVarArgs.T(13, this.eBlockSize_);
      paramVarArgs.T(14, this.eBlockCount_);
      paramVarArgs.T(15, this.eTotalSize_);
      paramVarArgs.T(16, this.eAvailableBlockCount_);
      paramVarArgs.T(17, this.eAvailableSize_);
      paramVarArgs.fk(18, this.eAvailablePer_);
      if (this.ePath_ != null) {
        paramVarArgs.e(19, this.ePath_);
      }
      if (this.root_ != null) {
        paramVarArgs.e(20, this.root_);
      }
      if (this.fSystem_ != null) {
        paramVarArgs.e(21, this.fSystem_);
      }
      GMTrace.o(17507360440320L, 130440);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.weChatSDInfo_ != null) {
        paramInt = b.a.a.a.fj(1, this.weChatSDInfo_.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.weChatPer_) + b.a.a.a.fh(3, this.sizeHeavy_) + b.a.a.a.fh(4, this.ratioHeavy_) + b.a.a.a.fh(5, this.useExternal_) + b.a.a.a.fh(6, this.hasUnRemovable_) + b.a.a.a.S(7, this.sBlockSize_) + b.a.a.a.S(8, this.sBlockCount_) + b.a.a.a.S(9, this.sTotalSize_) + b.a.a.a.S(10, this.sAvailableBlockCount_) + b.a.a.a.S(11, this.sAvailableSize_) + b.a.a.a.fh(12, this.sAvailablePer_) + b.a.a.a.S(13, this.eBlockSize_) + b.a.a.a.S(14, this.eBlockCount_) + b.a.a.a.S(15, this.eTotalSize_) + b.a.a.a.S(16, this.eAvailableBlockCount_) + b.a.a.a.S(17, this.eAvailableSize_) + b.a.a.a.fh(18, this.eAvailablePer_);
      paramInt = i;
      if (this.ePath_ != null) {
        paramInt = i + b.a.a.b.b.a.f(19, this.ePath_);
      }
      i = paramInt;
      if (this.root_ != null) {
        i = paramInt + b.a.a.b.b.a.f(20, this.root_);
      }
      paramInt = i;
      if (this.fSystem_ != null) {
        paramInt = i + b.a.a.b.b.a.f(21, this.fSystem_);
      }
      GMTrace.o(17507360440320L, 130440);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.weChatSDInfo_ == null) {
        throw new b("Not all required fields were included: weChatSDInfo_");
      }
      GMTrace.o(17507360440320L, 130440);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      SDStatusInfo localSDStatusInfo = (SDStatusInfo)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(17507360440320L, 130440);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new WeChatSDInfo();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((WeChatSDInfo)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localSDStatusInfo.weChatSDInfo_ = ((WeChatSDInfo)localObject1);
          paramInt += 1;
        }
        GMTrace.o(17507360440320L, 130440);
        return 0;
      case 2: 
        localSDStatusInfo.weChatPer_ = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(17507360440320L, 130440);
        return 0;
      case 3: 
        localSDStatusInfo.sizeHeavy_ = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(17507360440320L, 130440);
        return 0;
      case 4: 
        localSDStatusInfo.ratioHeavy_ = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(17507360440320L, 130440);
        return 0;
      case 5: 
        localSDStatusInfo.useExternal_ = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(17507360440320L, 130440);
        return 0;
      case 6: 
        localSDStatusInfo.hasUnRemovable_ = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(17507360440320L, 130440);
        return 0;
      case 7: 
        localSDStatusInfo.sBlockSize_ = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(17507360440320L, 130440);
        return 0;
      case 8: 
        localSDStatusInfo.sBlockCount_ = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(17507360440320L, 130440);
        return 0;
      case 9: 
        localSDStatusInfo.sTotalSize_ = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(17507360440320L, 130440);
        return 0;
      case 10: 
        localSDStatusInfo.sAvailableBlockCount_ = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(17507360440320L, 130440);
        return 0;
      case 11: 
        localSDStatusInfo.sAvailableSize_ = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(17507360440320L, 130440);
        return 0;
      case 12: 
        localSDStatusInfo.sAvailablePer_ = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(17507360440320L, 130440);
        return 0;
      case 13: 
        localSDStatusInfo.eBlockSize_ = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(17507360440320L, 130440);
        return 0;
      case 14: 
        localSDStatusInfo.eBlockCount_ = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(17507360440320L, 130440);
        return 0;
      case 15: 
        localSDStatusInfo.eTotalSize_ = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(17507360440320L, 130440);
        return 0;
      case 16: 
        localSDStatusInfo.eAvailableBlockCount_ = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(17507360440320L, 130440);
        return 0;
      case 17: 
        localSDStatusInfo.eAvailableSize_ = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(17507360440320L, 130440);
        return 0;
      case 18: 
        localSDStatusInfo.eAvailablePer_ = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(17507360440320L, 130440);
        return 0;
      case 19: 
        localSDStatusInfo.ePath_ = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(17507360440320L, 130440);
        return 0;
      case 20: 
        localSDStatusInfo.root_ = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(17507360440320L, 130440);
        return 0;
      }
      localSDStatusInfo.fSystem_ = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(17507360440320L, 130440);
      return 0;
    }
    GMTrace.o(17507360440320L, 130440);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\report\kvdata\SDStatusInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */