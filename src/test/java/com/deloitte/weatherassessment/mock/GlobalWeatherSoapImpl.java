package com.deloitte.weatherassessment.mock;

import net.webservicex.GlobalWeatherSoap;

import java.net.SocketTimeoutException;

public class GlobalWeatherSoapImpl implements GlobalWeatherSoap {
    @Override
    public String getCitiesByCountry(String countryName) {
        return "<![CDATA[&lt;NewDataSet&gt;\n" +
                "  &lt;Table&gt;\n" +
                "    &lt;Country&gt;Australia&lt;/Country&gt;\n" +
                "    &lt;City&gt;Archerfield Aerodrome&lt;/City&gt;\n" +
                "  &lt;/Table&gt;\n" +
                "  &lt;Table&gt;\n" +
                "    &lt;Country&gt;Australia&lt;/Country&gt;\n" +
                "    &lt;City&gt;Amberley Aerodrome&lt;/City&gt;\n" +
                "  &lt;/Table&gt;\n" +
                "  &lt;Table&gt;\n" +
                "    &lt;Country&gt;Australia&lt;/Country&gt;\n" +
                "    &lt;City&gt;Alice Springs Aerodrome&lt;/City&gt;\n" +
                "  &lt;/Table&gt;\n" +
                "  &lt;Table&gt;\n" +
                "    &lt;Country&gt;Australia&lt;/Country&gt;\n" +
                "    &lt;City&gt;Brisbane Airport M. O&lt;/City&gt;\n" +
                "  &lt;/Table&gt;\n" +
                "  &lt;Table&gt;\n" +
                "    &lt;Country&gt;Australia&lt;/Country&gt;\n" +
                "    &lt;City&gt;Coolangatta Airport Aws&lt;/City&gt;\n" +
                "  &lt;/Table&gt;\n" +
                "  &lt;Table&gt;\n" +
                "    &lt;Country&gt;Australia&lt;/Country&gt;\n" +
                "    &lt;City&gt;Cairns Airport&lt;/City&gt;\n" +
                "  &lt;/Table&gt;\n" +
                "  &lt;Table&gt;\n" +
                "    &lt;Country&gt;Australia&lt;/Country&gt;\n" +
                "    &lt;City&gt;Charleville Airport&lt;/City&gt;\n" +
                "  &lt;/Table&gt;\n" +
                "  &lt;Table&gt;\n" +
                "    &lt;Country&gt;Australia&lt;/Country&gt;\n" +
                "    &lt;City&gt;Gladstone&lt;/City&gt;\n" +
                "  &lt;/Table&gt;\n" +
                "  &lt;Table&gt;\n" +
                "    &lt;Country&gt;Australia&lt;/Country&gt;\n" +
                "    &lt;City&gt;Longreach Airport&lt;/City&gt;\n" +
                "  &lt;/Table&gt;\n" +
                "  &lt;Table&gt;\n" +
                "    &lt;Country&gt;Australia&lt;/Country&gt;\n" +
                "    &lt;City&gt;Mount Isa Amo&lt;/City&gt;\n" +
                "  &lt;/Table&gt;\n" +
                "  &lt;Table&gt;\n" +
                "    &lt;Country&gt;Australia&lt;/Country&gt;\n" +
                "    &lt;City&gt;Mackay Mo&lt;/City&gt;\n" +
                "  &lt;/Table&gt;\n" +
                "  &lt;Table&gt;\n" +
                "    &lt;Country&gt;Australia&lt;/Country&gt;\n" +
                "    &lt;City&gt;Oakey Aerodrome&lt;/City&gt;\n" +
                "  &lt;/Table&gt;\n" +
                "  &lt;Table&gt;\n" +
                "    &lt;Country&gt;Australia&lt;/Country&gt;\n" +
                "    &lt;City&gt;Proserpine Airport&lt;/City&gt;\n" +
                "  &lt;/Table&gt;\n" +
                "  &lt;Table&gt;\n" +
                "    &lt;Country&gt;Australia&lt;/Country&gt;\n" +
                "    &lt;City&gt;Rockhampton Airport&lt;/City&gt;\n" +
                "  &lt;/Table&gt;\n" +
                "  &lt;Table&gt;\n" +
                "    &lt;Country&gt;Australia&lt;/Country&gt;\n" +
                "    &lt;City&gt;Broome Airport&lt;/City&gt;\n" +
                "  &lt;/Table&gt;\n" +
                "  &lt;Table&gt;\n" +
                "    &lt;Country&gt;Australia&lt;/Country&gt;\n" +
                "    &lt;City&gt;Townsville Amo&lt;/City&gt;\n" +
                "  &lt;/Table&gt;\n" +
                "  &lt;Table&gt;\n" +
                "    &lt;Country&gt;Australia&lt;/Country&gt;\n" +
                "    &lt;City&gt;Weipa City&lt;/City&gt;\n" +
                "  &lt;/Table&gt;\n" +
                "  &lt;Table&gt;\n" +
                "    &lt;Country&gt;Australia&lt;/Country&gt;\n" +
                "    &lt;City&gt;Gove Airport&lt;/City&gt;\n" +
                "  &lt;/Table&gt;\n" +
                "  &lt;Table&gt;\n" +
                "    &lt;Country&gt;Australia&lt;/Country&gt;\n" +
                "    &lt;City&gt;Tennant Creek Airport&lt;/City&gt;\n" +
                "  &lt;/Table&gt;\n" +
                "  &lt;Table&gt;\n" +
                "    &lt;Country&gt;Australia&lt;/Country&gt;\n" +
                "    &lt;City&gt;Yulara Aws&lt;/City&gt;\n" +
                "  &lt;/Table&gt;\n" +
                "  &lt;Table&gt;\n" +
                "    &lt;Country&gt;Australia&lt;/Country&gt;\n" +
                "    &lt;City&gt;Albury Airport&lt;/City&gt;\n" +
                "  &lt;/Table&gt;\n" +
                "  &lt;Table&gt;\n" +
                "    &lt;Country&gt;Australia&lt;/Country&gt;\n" +
                "    &lt;City&gt;Devonport East&lt;/City&gt;\n" +
                "  &lt;/Table&gt;\n" +
                "  &lt;Table&gt;\n" +
                "    &lt;Country&gt;Australia&lt;/Country&gt;\n" +
                "    &lt;City&gt;Goldstream Aws&lt;/City&gt;\n" +
                "  &lt;/Table&gt;\n" +
                "  &lt;Table&gt;\n" +
                "    &lt;Country&gt;Australia&lt;/Country&gt;\n" +
                "    &lt;City&gt;East Sale Aerodrome&lt;/City&gt;\n" +
                "  &lt;/Table&gt;\n" +
                "  &lt;Table&gt;\n" +
                "    &lt;Country&gt;Australia&lt;/Country&gt;\n" +
                "    &lt;City&gt;Hobart Airport&lt;/City&gt;\n" +
                "  &lt;/Table&gt;\n" +
                "  &lt;Table&gt;\n" +
                "    &lt;Country&gt;Australia&lt;/Country&gt;\n" +
                "    &lt;City&gt;Launceston Airport&lt;/City&gt;\n" +
                "  &lt;/Table&gt;\n" +
                "  &lt;Table&gt;\n" +
                "    &lt;Country&gt;Australia&lt;/Country&gt;\n" +
                "    &lt;City&gt;Laverton Aerodrome&lt;/City&gt;\n" +
                "  &lt;/Table&gt;\n" +
                "  &lt;Table&gt;\n" +
                "    &lt;Country&gt;Australia&lt;/Country&gt;\n" +
                "    &lt;City&gt;Moorabbin Airport Aws&lt;/City&gt;\n" +
                "  &lt;/Table&gt;\n" +
                "  &lt;Table&gt;\n" +
                "    &lt;Country&gt;Australia&lt;/Country&gt;\n" +
                "    &lt;City&gt;Mount Gambier Aerodrome&lt;/City&gt;\n" +
                "  &lt;/Table&gt;\n" +
                "  &lt;Table&gt;\n" +
                "    &lt;Country&gt;Australia&lt;/Country&gt;\n" +
                "    &lt;City&gt;Mildura Airport&lt;/City&gt;\n" +
                "  &lt;/Table&gt;\n" +
                "  &lt;Table&gt;\n" +
                "    &lt;Country&gt;Australia&lt;/Country&gt;\n" +
                "    &lt;City&gt;Melbourne Airport&lt;/City&gt;\n" +
                "  &lt;/Table&gt;\n" +
                "  &lt;Table&gt;\n" +
                "    &lt;Country&gt;Australia&lt;/Country&gt;\n" +
                "    &lt;City&gt;Macquarie Island&lt;/City&gt;\n" +
                "  &lt;/Table&gt;\n" +
                "  &lt;Table&gt;\n" +
                "    &lt;Country&gt;Australia&lt;/Country&gt;\n" +
                "    &lt;City&gt;Wynyard West&lt;/City&gt;\n" +
                "  &lt;/Table&gt;\n" +
                "  &lt;Table&gt;\n" +
                "    &lt;Country&gt;Australia&lt;/Country&gt;\n" +
                "    &lt;City&gt;Adelaide Airport&lt;/City&gt;\n" +
                "  &lt;/Table&gt;\n" +
                "  &lt;Table&gt;\n" +
                "    &lt;Country&gt;Australia&lt;/Country&gt;\n" +
                "    &lt;City&gt;Albany Airport&lt;/City&gt;\n" +
                "  &lt;/Table&gt;\n" +
                "  &lt;Table&gt;\n" +
                "    &lt;Country&gt;Australia&lt;/Country&gt;\n" +
                "    &lt;City&gt;Broken Hill Patton Street&lt;/City&gt;\n" +
                "  &lt;/Table&gt;\n" +
                "  &lt;Table&gt;\n" +
                "    &lt;Country&gt;Australia&lt;/Country&gt;\n" +
                "    &lt;City&gt;Ceduna Airport&lt;/City&gt;\n" +
                "  &lt;/Table&gt;\n" +
                "  &lt;Table&gt;\n" +
                "    &lt;Country&gt;Australia&lt;/Country&gt;\n" +
                "    &lt;City&gt;Derby&lt;/City&gt;\n" +
                "  &lt;/Table&gt;\n" +
                "  &lt;Table&gt;\n" +
                "    &lt;Country&gt;Australia&lt;/Country&gt;\n" +
                "    &lt;City&gt;Darwin Airport&lt;/City&gt;\n" +
                "  &lt;/Table&gt;\n" +
                "  &lt;Table&gt;\n" +
                "    &lt;Country&gt;Australia&lt;/Country&gt;\n" +
                "    &lt;City&gt;Bullsbrook Pearce Amo&lt;/City&gt;\n" +
                "  &lt;/Table&gt;\n" +
                "  &lt;Table&gt;\n" +
                "    &lt;Country&gt;Australia&lt;/Country&gt;\n" +
                "    &lt;City&gt;Edinburgh M. O.&lt;/City&gt;\n" +
                "  &lt;/Table&gt;\n" +
                "  &lt;Table&gt;\n" +
                "    &lt;Country&gt;Australia&lt;/Country&gt;\n" +
                "    &lt;City&gt;Forrest Airport&lt;/City&gt;\n" +
                "  &lt;/Table&gt;\n" +
                "  &lt;Table&gt;\n" +
                "    &lt;Country&gt;Australia&lt;/Country&gt;\n" +
                "    &lt;City&gt;Geraldton Airport&lt;/City&gt;\n" +
                "  &lt;/Table&gt;\n" +
                "  &lt;Table&gt;\n" +
                "    &lt;Country&gt;Australia&lt;/Country&gt;\n" +
                "    &lt;City&gt;Kalgoorlie Boulder Amo&lt;/City&gt;\n" +
                "  &lt;/Table&gt;\n" +
                "  &lt;Table&gt;\n" +
                "    &lt;Country&gt;Australia&lt;/Country&gt;\n" +
                "    &lt;City&gt;Kununurra Kununurra Aws&lt;/City&gt;\n" +
                "  &lt;/Table&gt;\n" +
                "  &lt;Table&gt;\n" +
                "    &lt;Country&gt;Australia&lt;/Country&gt;\n" +
                "    &lt;City&gt;Leigh Creek Airport&lt;/City&gt;\n" +
                "  &lt;/Table&gt;\n" +
                "  &lt;Table&gt;\n" +
                "    &lt;Country&gt;Australia&lt;/Country&gt;\n" +
                "    &lt;City&gt;Learmonth Airport&lt;/City&gt;\n" +
                "  &lt;/Table&gt;\n" +
                "  &lt;Table&gt;\n" +
                "    &lt;Country&gt;Australia&lt;/Country&gt;\n" +
                "    &lt;City&gt;Meekatharra Airport&lt;/City&gt;\n" +
                "  &lt;/Table&gt;\n" +
                "  &lt;Table&gt;\n" +
                "    &lt;Country&gt;Australia&lt;/Country&gt;\n" +
                "    &lt;City&gt;Port Hedland Pardoo&lt;/City&gt;\n" +
                "  &lt;/Table&gt;\n" +
                "  &lt;Table&gt;\n" +
                "    &lt;Country&gt;Australia&lt;/Country&gt;\n" +
                "    &lt;City&gt;Parafield Airport&lt;/City&gt;\n" +
                "  &lt;/Table&gt;\n" +
                "  &lt;Table&gt;\n" +
                "    &lt;Country&gt;Australia&lt;/Country&gt;\n" +
                "    &lt;City&gt;Belmont Perth Airport&lt;/City&gt;\n" +
                "  &lt;/Table&gt;\n" +
                "  &lt;Table&gt;\n" +
                "    &lt;Country&gt;Australia&lt;/Country&gt;\n" +
                "    &lt;City&gt;Katherine Aerodrome&lt;/City&gt;\n" +
                "  &lt;/Table&gt;\n" +
                "  &lt;Table&gt;\n" +
                "    &lt;Country&gt;Australia&lt;/Country&gt;\n" +
                "    &lt;City&gt;Woomera Aerodrome&lt;/City&gt;\n" +
                "  &lt;/Table&gt;\n" +
                "  &lt;Table&gt;\n" +
                "    &lt;Country&gt;Australia&lt;/Country&gt;\n" +
                "    &lt;City&gt;Bankstown Airport Aws&lt;/City&gt;\n" +
                "  &lt;/Table&gt;\n" +
                "  &lt;Table&gt;\n" +
                "    &lt;Country&gt;Australia&lt;/Country&gt;\n" +
                "    &lt;City&gt;Canberra&lt;/City&gt;\n" +
                "  &lt;/Table&gt;\n" +
                "  &lt;Table&gt;\n" +
                "    &lt;Country&gt;Australia&lt;/Country&gt;\n" +
                "    &lt;City&gt;Coffs Harbour Mo&lt;/City&gt;\n" +
                "  &lt;/Table&gt;\n" +
                "  &lt;Table&gt;\n" +
                "    &lt;Country&gt;Australia&lt;/Country&gt;\n" +
                "    &lt;City&gt;Cooma&lt;/City&gt;\n" +
                "  &lt;/Table&gt;\n" +
                "  &lt;Table&gt;\n" +
                "    &lt;Country&gt;Australia&lt;/Country&gt;\n" +
                "    &lt;City&gt;Camden Airport&lt;/City&gt;\n" +
                "  &lt;/Table&gt;\n" +
                "  &lt;Table&gt;\n" +
                "    &lt;Country&gt;Australia&lt;/Country&gt;\n" +
                "    &lt;City&gt;Dubbo&lt;/City&gt;\n" +
                "  &lt;/Table&gt;\n" +
                "  &lt;Table&gt;\n" +
                "    &lt;Country&gt;Australia&lt;/Country&gt;\n" +
                "    &lt;City&gt;Norfolk Island Airport&lt;/City&gt;\n" +
                "  &lt;/Table&gt;\n" +
                "  &lt;Table&gt;\n" +
                "    &lt;Country&gt;Australia&lt;/Country&gt;\n" +
                "    &lt;City&gt;Nowra Ran Air Station&lt;/City&gt;\n" +
                "  &lt;/Table&gt;\n" +
                "  &lt;Table&gt;\n" +
                "    &lt;Country&gt;Australia&lt;/Country&gt;\n" +
                "    &lt;City&gt;Richmond Aus-Afb&lt;/City&gt;\n" +
                "  &lt;/Table&gt;\n" +
                "  &lt;Table&gt;\n" +
                "    &lt;Country&gt;Australia&lt;/Country&gt;\n" +
                "    &lt;City&gt;Sydney Airport&lt;/City&gt;\n" +
                "  &lt;/Table&gt;\n" +
                "  &lt;Table&gt;\n" +
                "    &lt;Country&gt;Australia&lt;/Country&gt;\n" +
                "    &lt;City&gt;Tamworth Airport&lt;/City&gt;\n" +
                "  &lt;/Table&gt;\n" +
                "  &lt;Table&gt;\n" +
                "    &lt;Country&gt;Australia&lt;/Country&gt;\n" +
                "    &lt;City&gt;Wagga Airport&lt;/City&gt;\n" +
                "  &lt;/Table&gt;\n" +
                "  &lt;Table&gt;\n" +
                "    &lt;Country&gt;Australia&lt;/Country&gt;\n" +
                "    &lt;City&gt;Williamtown Aerodrome&lt;/City&gt;\n" +
                "  &lt;/Table&gt;\n" +
                "&lt;/NewDataSet&gt;]]>";
    }

    @Override
    public String getWeather(String cityName, String countryName) {
        return "<![CDATA[&lt;NewDataSet&gt;\n" +
                "    &lt;Location&gt;Melbourne&lt;/Location&gt;\n" +
                "    &lt;Time&gt;11 AM&lt;/Time&gt;\n" +
                "    &lt;Wind&gt;15 km per hour&lt;/Wind&gt;\n" +
                "    &lt;Visibility&gt;10 km&lt;/Visibility&gt;\n" +
                "    &lt;SkyConditions&gt;sunny&lt;/SkyConditions&gt;\n" +
                "    &lt;Temperature&gt;18&lt;/Temperature&gt;\n" +
                "    &lt;DewPoint&gt;2 C&lt;/DewPoint&gt;\n" +
                "    &lt;RelativeHumidity&gt;35&lt;/RelativeHumidity&gt;\n" +
                "    &lt;Status&gt;Normal&lt;/Status&gt;\n" +
                "&lt;/NewDataSet&gt;]]>\n";
    }
}
