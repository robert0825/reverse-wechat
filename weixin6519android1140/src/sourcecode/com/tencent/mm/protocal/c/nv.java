package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class nv
  extends ayx
{
  public String lQa;
  public String tSz;
  public String ueB;
  public String ueC;
  
  public nv()
  {
    GMTrace.i(3649111588864L, 27188);
    GMTrace.o(3649111588864L, 27188);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3649245806592L, 27189);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.ueB == null) {
        throw new b("Not all required fields were included: DeviceId");
      }
      if (this.tSz == null) {
        throw new b("Not all required fields were included: DeviceType");
      }
      if (this.ueC == null) {
        throw new b("Not all required fields were included: ClientInfo");
      }
      if (this.lQa == null) {
        throw new b("Not all required fields were included: AppId");
      }
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.ueB != null) {
        paramVarArgs.e(2, this.ueB);
      }
      if (this.tSz != null) {
        paramVarArgs.e(3, this.tSz);
      }
      if (this.ueC != null) {
        paramVarArgs.e(4, this.ueC);
      }
      if (this.lQa != null) {
        paramVarArgs.e(5, this.lQa);
      }
      GMTrace.o(3649245806592L, 27189);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.uNh != null) {
        i = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      paramInt = i;
      if (this.ueB != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.ueB);
      }
      i = paramInt;
      if (this.tSz != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.tSz);
      }
      paramInt = i;
      if (this.ueC != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.ueC);
      }
      i = paramInt;
      if (this.lQa != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.lQa);
      }
      GMTrace.o(3649245806592L, 27189);
      return i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.ueB == null) {
        throw new b("Not all required fields were included: DeviceId");
      }
      if (this.tSz == null) {
        throw new b("Not all required fields were included: DeviceType");
      }
      if (this.ueC == null) {
        throw new b("Not all required fields were included: ClientInfo");
      }
      if (this.lQa == null) {
        throw new b("Not all required fields were included: AppId");
      }
      GMTrace.o(3649245806592L, 27189);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      nv localnv = (nv)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3649245806592L, 27189);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new er();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((er)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localnv.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3649245806592L, 27189);
        return 0;
      case 2: 
        localnv.ueB = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3649245806592L, 27189);
        return 0;
      case 3: 
        localnv.tSz = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3649245806592L, 27189);
        return 0;
      case 4: 
        localnv.ueC = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3649245806592L, 27189);
        return 0;
      }
      localnv.lQa = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(3649245806592L, 27189);
      return 0;
    }
    GMTrace.o(3649245806592L, 27189);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\nv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */