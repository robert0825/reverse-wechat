package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class uw
  extends com.tencent.mm.bm.a
{
  public String lPi;
  public String lPk;
  public String lQa;
  public String lRV;
  public String ueH;
  public vf unc;
  public int und;
  public String une;
  
  public uw()
  {
    GMTrace.i(3719307460608L, 27711);
    GMTrace.o(3719307460608L, 27711);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3719441678336L, 27712);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.lQa == null) {
        throw new b("Not all required fields were included: AppId");
      }
      if (this.lPi == null) {
        throw new b("Not all required fields were included: Name");
      }
      if (this.ueH == null) {
        throw new b("Not all required fields were included: Remark");
      }
      if (this.lRV == null) {
        throw new b("Not all required fields were included: IconUrl");
      }
      if (this.unc == null) {
        throw new b("Not all required fields were included: DownloadInfo");
      }
      if (this.lQa != null) {
        paramVarArgs.e(1, this.lQa);
      }
      if (this.lPi != null) {
        paramVarArgs.e(2, this.lPi);
      }
      if (this.ueH != null) {
        paramVarArgs.e(3, this.ueH);
      }
      if (this.lRV != null) {
        paramVarArgs.e(4, this.lRV);
      }
      if (this.lPk != null) {
        paramVarArgs.e(5, this.lPk);
      }
      if (this.unc != null)
      {
        paramVarArgs.fm(6, this.unc.aYq());
        this.unc.a(paramVarArgs);
      }
      paramVarArgs.fk(7, this.und);
      if (this.une != null) {
        paramVarArgs.e(8, this.une);
      }
      GMTrace.o(3719441678336L, 27712);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.lQa != null) {
        i = b.a.a.b.b.a.f(1, this.lQa) + 0;
      }
      paramInt = i;
      if (this.lPi != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.lPi);
      }
      i = paramInt;
      if (this.ueH != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.ueH);
      }
      paramInt = i;
      if (this.lRV != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.lRV);
      }
      i = paramInt;
      if (this.lPk != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.lPk);
      }
      paramInt = i;
      if (this.unc != null) {
        paramInt = i + b.a.a.a.fj(6, this.unc.aYq());
      }
      i = paramInt + b.a.a.a.fh(7, this.und);
      paramInt = i;
      if (this.une != null) {
        paramInt = i + b.a.a.b.b.a.f(8, this.une);
      }
      GMTrace.o(3719441678336L, 27712);
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
      if (this.lQa == null) {
        throw new b("Not all required fields were included: AppId");
      }
      if (this.lPi == null) {
        throw new b("Not all required fields were included: Name");
      }
      if (this.ueH == null) {
        throw new b("Not all required fields were included: Remark");
      }
      if (this.lRV == null) {
        throw new b("Not all required fields were included: IconUrl");
      }
      if (this.unc == null) {
        throw new b("Not all required fields were included: DownloadInfo");
      }
      GMTrace.o(3719441678336L, 27712);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      uw localuw = (uw)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3719441678336L, 27712);
        return -1;
      case 1: 
        localuw.lQa = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3719441678336L, 27712);
        return 0;
      case 2: 
        localuw.lPi = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3719441678336L, 27712);
        return 0;
      case 3: 
        localuw.ueH = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3719441678336L, 27712);
        return 0;
      case 4: 
        localuw.lRV = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3719441678336L, 27712);
        return 0;
      case 5: 
        localuw.lPk = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3719441678336L, 27712);
        return 0;
      case 6: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new vf();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((vf)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localuw.unc = ((vf)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3719441678336L, 27712);
        return 0;
      case 7: 
        localuw.und = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3719441678336L, 27712);
        return 0;
      }
      localuw.une = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(3719441678336L, 27712);
      return 0;
    }
    GMTrace.o(3719441678336L, 27712);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\uw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */