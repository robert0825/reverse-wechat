package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class vo
  extends azh
{
  public String SSID;
  public String eBt;
  public String jhi;
  public String mmS;
  public String nIp;
  public String tMU;
  public int tNf;
  public azp unW;
  public String unX;
  public String unY;
  public ajd unZ;
  public vk uoa;
  public String uob;
  public int uoc;
  public LinkedList<ht> uod;
  public String uoe;
  public oq uof;
  public azp uog;
  public int uoh;
  public LinkedList<ahp> uoi;
  public String uoj;
  
  public vo()
  {
    GMTrace.i(3925331673088L, 29246);
    this.uod = new LinkedList();
    this.uoi = new LinkedList();
    GMTrace.o(3925331673088L, 29246);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3925465890816L, 29247);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.uND != null)
      {
        paramVarArgs.fm(1, this.uND.aYq());
        this.uND.a(paramVarArgs);
      }
      if (this.unX != null) {
        paramVarArgs.e(2, this.unX);
      }
      if (this.unY != null) {
        paramVarArgs.e(3, this.unY);
      }
      paramVarArgs.fk(4, this.tNf);
      if (this.eBt != null) {
        paramVarArgs.e(5, this.eBt);
      }
      if (this.nIp != null) {
        paramVarArgs.e(6, this.nIp);
      }
      if (this.unZ != null)
      {
        paramVarArgs.fm(7, this.unZ.aYq());
        this.unZ.a(paramVarArgs);
      }
      if (this.uoa != null)
      {
        paramVarArgs.fm(8, this.uoa.aYq());
        this.uoa.a(paramVarArgs);
      }
      if (this.jhi != null) {
        paramVarArgs.e(9, this.jhi);
      }
      if (this.uob != null) {
        paramVarArgs.e(15, this.uob);
      }
      paramVarArgs.fk(16, this.uoc);
      paramVarArgs.d(17, 8, this.uod);
      if (this.uoe != null) {
        paramVarArgs.e(18, this.uoe);
      }
      if (this.SSID != null) {
        paramVarArgs.e(20, this.SSID);
      }
      if (this.tMU != null) {
        paramVarArgs.e(21, this.tMU);
      }
      if (this.uof != null)
      {
        paramVarArgs.fm(22, this.uof.aYq());
        this.uof.a(paramVarArgs);
      }
      if (this.uog != null)
      {
        paramVarArgs.fm(23, this.uog.aYq());
        this.uog.a(paramVarArgs);
      }
      paramVarArgs.fk(24, this.uoh);
      paramVarArgs.d(25, 8, this.uoi);
      if (this.mmS != null) {
        paramVarArgs.e(26, this.mmS);
      }
      if (this.uoj != null) {
        paramVarArgs.e(27, this.uoj);
      }
      if (this.unW != null)
      {
        paramVarArgs.fm(28, this.unW.aYq());
        this.unW.a(paramVarArgs);
      }
      GMTrace.o(3925465890816L, 29247);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.uND != null) {
        i = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      paramInt = i;
      if (this.unX != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.unX);
      }
      i = paramInt;
      if (this.unY != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.unY);
      }
      i += b.a.a.a.fh(4, this.tNf);
      paramInt = i;
      if (this.eBt != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.eBt);
      }
      i = paramInt;
      if (this.nIp != null) {
        i = paramInt + b.a.a.b.b.a.f(6, this.nIp);
      }
      paramInt = i;
      if (this.unZ != null) {
        paramInt = i + b.a.a.a.fj(7, this.unZ.aYq());
      }
      i = paramInt;
      if (this.uoa != null) {
        i = paramInt + b.a.a.a.fj(8, this.uoa.aYq());
      }
      paramInt = i;
      if (this.jhi != null) {
        paramInt = i + b.a.a.b.b.a.f(9, this.jhi);
      }
      i = paramInt;
      if (this.uob != null) {
        i = paramInt + b.a.a.b.b.a.f(15, this.uob);
      }
      i = i + b.a.a.a.fh(16, this.uoc) + b.a.a.a.c(17, 8, this.uod);
      paramInt = i;
      if (this.uoe != null) {
        paramInt = i + b.a.a.b.b.a.f(18, this.uoe);
      }
      i = paramInt;
      if (this.SSID != null) {
        i = paramInt + b.a.a.b.b.a.f(20, this.SSID);
      }
      paramInt = i;
      if (this.tMU != null) {
        paramInt = i + b.a.a.b.b.a.f(21, this.tMU);
      }
      i = paramInt;
      if (this.uof != null) {
        i = paramInt + b.a.a.a.fj(22, this.uof.aYq());
      }
      paramInt = i;
      if (this.uog != null) {
        paramInt = i + b.a.a.a.fj(23, this.uog.aYq());
      }
      i = paramInt + b.a.a.a.fh(24, this.uoh) + b.a.a.a.c(25, 8, this.uoi);
      paramInt = i;
      if (this.mmS != null) {
        paramInt = i + b.a.a.b.b.a.f(26, this.mmS);
      }
      i = paramInt;
      if (this.uoj != null) {
        i = paramInt + b.a.a.b.b.a.f(27, this.uoj);
      }
      paramInt = i;
      if (this.unW != null) {
        paramInt = i + b.a.a.a.fj(28, this.unW.aYq());
      }
      GMTrace.o(3925465890816L, 29247);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.uod.clear();
      this.uoi.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = azh.a(paramVarArgs); paramInt > 0; paramInt = azh.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      GMTrace.o(3925465890816L, 29247);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      vo localvo = (vo)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      case 10: 
      case 11: 
      case 12: 
      case 13: 
      case 14: 
      case 19: 
      default: 
        GMTrace.o(3925465890816L, 29247);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new es();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((es)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localvo.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3925465890816L, 29247);
        return 0;
      case 2: 
        localvo.unX = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3925465890816L, 29247);
        return 0;
      case 3: 
        localvo.unY = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3925465890816L, 29247);
        return 0;
      case 4: 
        localvo.tNf = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3925465890816L, 29247);
        return 0;
      case 5: 
        localvo.eBt = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3925465890816L, 29247);
        return 0;
      case 6: 
        localvo.nIp = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3925465890816L, 29247);
        return 0;
      case 7: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new ajd();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((ajd)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localvo.unZ = ((ajd)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3925465890816L, 29247);
        return 0;
      case 8: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new vk();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((vk)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localvo.uoa = ((vk)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3925465890816L, 29247);
        return 0;
      case 9: 
        localvo.jhi = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3925465890816L, 29247);
        return 0;
      case 15: 
        localvo.uob = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3925465890816L, 29247);
        return 0;
      case 16: 
        localvo.uoc = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3925465890816L, 29247);
        return 0;
      case 17: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new ht();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((ht)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localvo.uod.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3925465890816L, 29247);
        return 0;
      case 18: 
        localvo.uoe = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3925465890816L, 29247);
        return 0;
      case 20: 
        localvo.SSID = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3925465890816L, 29247);
        return 0;
      case 21: 
        localvo.tMU = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3925465890816L, 29247);
        return 0;
      case 22: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new oq();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((oq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localvo.uof = ((oq)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3925465890816L, 29247);
        return 0;
      case 23: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localvo.uog = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3925465890816L, 29247);
        return 0;
      case 24: 
        localvo.uoh = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3925465890816L, 29247);
        return 0;
      case 25: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new ahp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((ahp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localvo.uoi.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3925465890816L, 29247);
        return 0;
      case 26: 
        localvo.mmS = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3925465890816L, 29247);
        return 0;
      case 27: 
        localvo.uoj = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3925465890816L, 29247);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new azp();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
        localvo.unW = ((azp)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3925465890816L, 29247);
      return 0;
    }
    GMTrace.o(3925465890816L, 29247);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\vo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */