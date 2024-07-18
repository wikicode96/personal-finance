import { NavigationContainer } from '@react-navigation/native';
import { createBottomTabNavigator } from '@react-navigation/bottom-tabs';
import Months from '@/screens/Months';
import Years from '@/screens/Years';

const Tab = createBottomTabNavigator();

function BottomTab() {
  return (
    <Tab.Navigator>
      <Tab.Screen name="Months" component={ Months } />
      <Tab.Screen name="Years" component={ Years } />
    </Tab.Navigator>
  );
}


export default function BottomTabNavigation() {
  return (
    <NavigationContainer>
      <BottomTab></BottomTab>
    </NavigationContainer>
  );
}