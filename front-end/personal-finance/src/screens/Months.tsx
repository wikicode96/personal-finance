import { StyleSheet, Text, View } from 'react-native';

export default function Months() {
    return (
        <View style={styles.container}>
            <Text>Months</Text>
        </View>
    );
}

const styles = StyleSheet.create({
    container: {
        flex: 1,
        backgroundColor: '#fff',
        alignItems: 'center',
        justifyContent: 'center',
    },
});