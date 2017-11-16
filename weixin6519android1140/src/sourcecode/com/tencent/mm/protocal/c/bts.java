package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bts
  extends com.tencent.mm.bm.a
{
  public String umC;
  public String umE;
  public btr vco;
  
  public bts()
  {
    GMTrace.i(14999367974912L, 111754);
    GMTrace.o(14999367974912L, 111754);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(14999502192640L, 111755);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.umC == null) {
        throw new b("Not all required fields were included: Rid");
      }
      if (this.umE == null) {
        throw new b("Not all required fields were included: MimeType");
      }
      if (this.vco == null) {
        throw new b("Not all required fields were included: DownloadInfo");
      }
      if (this.umC != null) {
        paramVarArgs.e(1, this.umC);
      }
      if (this.umE != null) {
        paramVarArgs.e(2, this.umE);
      }
      if (this.vco != null)
      {
        paramVarArgs.fm(3, this.vco.aYq());
        this.vco.a(paramVarArgs);
      }
      GMTrace.o(14999502192640L, 111755);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.umC != null) {
        i = b.a.a.b.b.a.f(1, this.umC) + 0;
      }
      paramInt = i;
      if (this.umE != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.umE);
      }
      i = paramInt;
      if (this.vco != null) {
        i = paramInt + b.a.a.a.fj(3, this.vco.aYq());
      }
      GMTrace.o(14999502192640L, 111755);
      return i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.umC == null) {
        throw new b("Not all required fields were included: Rid");
      }
      if (this.umE == null) {
        throw new b("Not all required fields were included: MimeType");
      }
      if (this.vco == null) {
        throw new b("Not all required fields were included: DownloadInfo");
      }
      GMTrace.o(14999502192640L, 111755);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bts localbts = (bts)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(14999502192640L, 111755);
        return -1;
      case 1: 
        localbts.umC = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(14999502192640L, 111755);
        return 0;
      case 2: 
        localbts.umE = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(14999502192640L, 111755);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        Object localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new btr();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (boolean bool = true; bool; bool = ((btr)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        localbts.vco = ((btr)localObject1);
        paramInt += 1;
      }
      GMTrace.o(14999502192640L, 111755);
      return 0;
    }
    GMTrace.o(14999502192640L, 111755);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\bts.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */